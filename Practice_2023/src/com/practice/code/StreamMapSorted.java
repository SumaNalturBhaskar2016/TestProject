package com.practice.code;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapSorted {
	
	 
	 
	 
	 
	public static void main(String[] args) {
		
		employee e1 = new employee(5, "suma");
		 employee e2 = new employee(4, "abc");
		 employee e3 = new employee(8, "ddd");
		 employee e4 = new employee(1, "eee");
		 employee e5 = new employee(2, "bbb");
		 
		
		Map<String,Integer> m  = new HashMap<>();
		
        m.put("a",2);
        m.put("d",7);
        m.put("b",5);
        m.put("c",1);
        m.put("e",3);
        
        
        Map<Integer,employee> map  = new HashMap<>();
        
        
        map.put(5,e1);
        map.put(2,e2);
        map.put(1,e3);
        map.put(3,e4);
        map.put(4,e5);
        
       // sort the keyset
        
        m.keySet().stream().sorted().forEach(System.out::println);
        
        //sort by values
        
        m.values().stream().sorted().forEach(System.out::println);
        
        // sort in decending order
        
        m.values().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        
        
         m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        
        
        ////////////////// 
        
        
        m.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        
        
        
        System.out.println(" this is employee related hands on map");
        
        // below one can be used if the existing code  uses the or implements the comparable
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        
       // map.values().stream().sorted(Comparator.comparing(employee::getEmpName)).forEach(System.out::println);
        
      Map<Integer,employee> r= map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(s,a)->s,LinkedHashMap::new));
        
        System.out.println(r);
        
        
        
		
		
	}
	
	

	

}

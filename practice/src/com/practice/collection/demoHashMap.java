package com.practice.collection;

import java.util.HashMap;
import java.util.Map;

public class demoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> a=new HashMap<String,Integer>();
		a.put("a", 2);
		a.put("b", 10);
		a.put("c",80 );
		a.put("d", 90);
		a.put("e",60);
		HashMap<String,Integer> a2=new HashMap<String,Integer>();
		a2.putAll(a);
		a2.putIfAbsent("d", 8);
		System.out.println(a2.toString());
		System.out.println(a2.get("a"));
		//compute and computeIfPresent both are similar but compute throw an exception
		//if key  does not exists but computeIfpresent does not
		a.compute("a",(k,v)->v+2);
		System.out.println("compute"+a.toString());
		
		a.computeIfPresent("k",(k,v)->v+6);
		System.out.println("compute ifPresent"+a.toString());
		
		
		a.computeIfAbsent("p",k->60+12);
		System.out.println("compute ifAbsent"+a.toString());
		
		//remove the mapping for specifield key if key is present 
		a.remove("a");
		System.out.println("remove"+a.toString());
		//remove the entry if of the specified key only if mapped to specified key
		a.remove("p", 7);
		System.out.println("remove"+a.toString());
		System.out.println("values"+a.values());// collection view of values
		System.out.println("keyset"+a.keySet());// set view of key
		System.out.println("entry"+a.entrySet());//collection view of mapping
		
		for(Map.Entry<String, Integer> m:a.entrySet()) {
		 System.out.println(m.getKey()+" "+m.getValue());
			
		}
		for(String m:a.keySet()) {
			 System.out.println("key"+m);
				
			}
		for(Integer m:a.values()) {
			 System.out.println("values"+m);
				
			}
	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

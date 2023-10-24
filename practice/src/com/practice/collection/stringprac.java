package com.practice.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class stringprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
	
        Map<String,Integer> m=new HashMap<>();	 
      
         String[] s= str.split(" ");
         for(String w: s) {
        	 if(m.containsKey(w)) {
        		 m.put(w, m.get(w)+1);
        	 }
        	 else {
        		 m.put(w, 1);
        	 }
         }
         
    	 System.out.println(m);
         
        for(Map.Entry<String, Integer> m1:m.entrySet()) {
        	 System.out.println(m1.getKey() +" "+m1.getValue());
         } 
      
	    
	    
		

	}

}

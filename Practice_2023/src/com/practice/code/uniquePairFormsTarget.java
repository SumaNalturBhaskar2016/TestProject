package com.practice.code;

import java.util.HashMap;
import java.util.Map;

public class uniquePairFormsTarget {
	
	
	public static void main(String[] args) {
		
		int[] arr=  new int[] {3, 7, 4, 1, 8, 2};
		int target=9;
		int num2=0;
		Map<Integer,Integer> map= new HashMap<Integer,Integer>();
		
	    for(int i=0;i<arr.length;i++) {
		  map.put(arr[i], map.getOrDefault(arr[i],0)+1);
	  }
	  
	    
	    //a+b=tarhet
	   // a=target-b
	  for(int num1: arr) {
		  num2=target-num1;
		  if(map.containsKey(num2) && map.get(num2)!=null) {
			  System.out.println(num1+ " "+ num2);
			  map.put(num2, null);
			  map.put(num1, null);
		  }
		  
	  }
		
	}

}

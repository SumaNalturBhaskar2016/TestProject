package com.practice.code;

import java.util.HashMap;
import java.util.Map;

public class absolutePairDifference {
	
	public static void main(String[] args) {
		Map<Integer,Integer> m = new HashMap<>();
		int[]arr = new int[] {2,5,9,10};
	    int k=3;
	    //a-a=k
	    //  a=k+a
		for(int i=0;i<arr.length;i++) {
			m.put(arr[i], m.getOrDefault(arr,0)+1);
		}
        
		for(int i=0;i<arr.length;i++) {
			if(m.containsKey(k+arr[i])) {
				System.out.println(arr[i] + " "+ (k+arr[i]));
			}
			
		}
		
		
		
	}
	
}

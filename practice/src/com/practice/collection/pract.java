package com.practice.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class pract {
	
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		
		Map<String,Integer> map = new HashMap<>();
		
		String  words[] = str.split(" ");
		for(String w : words) {
			if(map.containsKey(w)) {
				map.put(w,map.get(w)+1);
			}
			else {
				map.put(w,1);
			}
		}
		
		for(Map.Entry<String ,Integer> a: map.entrySet()) {
			
			System.out.println(a);
		}
		

	}
	
}

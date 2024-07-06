package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommanElements {
	
	
	public static void main(String[] args) {
		List<Integer> l1= new ArrayList<>(Arrays.asList(1,4,5,6));
		List<Integer> l2= new ArrayList<>(Arrays.asList(4,5,7,2));	
		for(int l: l1) {	
			if(l2.contains(l)) {
				System.out.println(l);
			}
			
		}
		
		// java 8
		
		l1.stream().filter(ele->l2.contains(ele)).forEach(System.out::println);
		
		
		
		
 	}

}

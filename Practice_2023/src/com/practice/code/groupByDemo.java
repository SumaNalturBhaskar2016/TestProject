package com.practice.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class groupByDemo {
	
	

	
	public static void main(String[] args) {
		
		List<Integer> l= Arrays.asList(3,5,7,8,7,3,3);
		Map<Integer,Long> m=l.stream().collect(Collectors.groupingBy(e->e,TreeMap::new,Collectors.counting()));
		System.out.print(m);
		
	}

}

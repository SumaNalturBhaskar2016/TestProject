package com.demo.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortValue {
	
	public static void main(String[] args) {
		
		List<products> prod=new ArrayList<products>();
		prod.add(new products(4,"dolo"));
		prod.add(new products(1,"calpal"));
		prod.add(new products(7,"domophine"));
		prod.add(new products(3,"anophine"));
		
		Collections.sort(prod);
		
		System.out.println(prod);
		
		
		
		
	}

	
	
	
	
	
	
	
}


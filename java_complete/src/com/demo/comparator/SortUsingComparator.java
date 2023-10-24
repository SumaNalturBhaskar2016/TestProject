package com.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUsingComparator {

	public static void main(String[] args) {
		
	
	List<emp> empData =new ArrayList<emp>();
	empData.add(new emp(4,"suma"));
	empData.add(new emp(3,"shreya"));
	empData.add(new emp(1,"kayya"));
	ToDoSort a=new ToDoSort();
	Collections.sort(empData,a);
	System.out.println(empData);
			
	}

}

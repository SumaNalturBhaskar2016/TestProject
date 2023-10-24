package com.demo.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToDoSort implements Comparator<emp> {

	@Override
	public int compare(emp o1, emp o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
		
	}
	
	
	

}

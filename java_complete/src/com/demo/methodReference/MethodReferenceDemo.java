package com.demo.methodReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MethodReferenceDemo {

	
	 public int mydata(int a,int b) {
		 return (a+b);
	 }
	 
	public static void main(String[] args) {
		
	
	//1.method reference of the static method
	
	Function<Integer, Double> f= (input)->Math.sqrt(input);//lamda
	System.out.println(f.apply(16));
	Function<Integer, Double> f2=Math::sqrt;// reference
	System.out.println(f.apply(16));
	
	
	//2.method reference of the static method
	
	  MethodReferenceDemo obj=new MethodReferenceDemo();
	  BiFunction<Integer,Integer, Integer> f1=(a,b)->obj.mydata(a, b);//lamda
	  System.out.println(f1.apply(10, 10));
	  
	  BiFunction<Integer, Integer, Integer> f3=obj::mydata;// reference
	  System.out.println(f1.apply(10, 10));
	  
	  
	//3.method reference of the instance method of arbitory objects
	//  (sometime we call the method of the argments which is pased)
	  Function<String, String> f6=(String m)->m.toUpperCase();
	  Function<String, String> f5=String::toUpperCase;
	  
	  
	  //4.method reference to a constructor
	  List<Integer> l=new ArrayList<Integer>();
	  l.add(4);
	  l.add(9);
	  Function<List<Integer>, HashSet<Integer>> g=(intList)->new HashSet(intList);
	  System.out.println(g.apply(l));
	  Function<List<Integer>, HashSet<Integer>> g1=HashSet:: new;
	  System.out.println(g1.apply(l));
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	
	
	}
	
}

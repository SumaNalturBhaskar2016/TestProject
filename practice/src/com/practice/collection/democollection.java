package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class democollection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s=new ArrayList<String>();
		s.add("suma");
		s.add("pavan");
		s.add("sonu");
		System.out.println("list of s"+s);
		
		ArrayList<String> s1=new ArrayList<String>();
		s1.add("latha");
		s1.add("bhaskar");
		
		s.addAll(s1);
		System.out.println("list of s after adding s1"+s);
		
		boolean k=s.contains("suma");
		System.out.println("contains the element"+k);
		
		s.remove("sonu");
		s.remove(1);
		
		System.out.println("after removing"+s);
		
		s.removeIf(p->(p.equals("suma")));
		System.out.println("after remove if "+s);
		
		System.out.println(s1);

		System.out.println(" size of s"+s.size());
		System.out.println("look list is empty"+s.isEmpty());
		
		s.replaceAll(e->e.toUpperCase());
		
		//s.retainAll(s1);
		System.out.println("retain all"+s.retainAll(s1));
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(6);
		a.add(5);
		a.add(8);
		ArrayList<Integer> a1= new ArrayList<Integer>(a);//constructor
		a1.toArray();
		for(Integer i:a1) {
			System.out.println("to array "+i);
		}
		Integer m[]=new Integer[a.size()];
		a1.toArray(m);
		System.out.println("to array  with arr parameter"+Arrays.toString(m));
		
		a.get(0);
		System.out.println("get the elements "+a.get(0));
		
		System.out.println("sublist of a"+a.subList(1,4));
		
	//traversing
		
		Iterator<Integer> itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println("traversing using iterator"+itr.next());
		}
		//using listIterator
		ListIterator<Integer> ltr = a.listIterator(a.size());
		while(ltr.hasPrevious())
		{
			System.out.println("traversing by using Listiterator"+ ltr.previous());
		}
		
		//enhanced for loop
		
		for(Integer l:a) {
			System.out.println("enhanced for loop"+l);
		}
		
		//old for loop
		
		for(int i=0;i<a.size();i++) {
			System.out.println("Old for loop"+a.get(i));
		}
		// for each loop;
		a.forEach(v->System.out.println("traversing ussing foreach of java 8"+v));
		// forEachRemaining
		Iterator<Integer> i1=a.iterator();
	  i1.forEachRemaining(v->System.out.println("traversing ussing foreach of java 8 version "+v));
		
	  System.out.println(a.clone());
	  
	  a.set(1, 10);
	  System.out.println(a.toString());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

package com.practice.collection;

import java.util.LinkedList;

public class demoLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l=new LinkedList<Integer>();
		
		l.add(1);
		l.add(8);
		l.add(6);
		l.add(5);
		
		System.out.println(l.toString());
		
		l.addFirst(7);
		l.addLast(9);
		System.out.println(l.toString());
		LinkedList<Integer> l2=new LinkedList<Integer>();
		l2.add(10);
		l2.add(13);
		
		l.addAll(2,l2);
		System.out.println(l.toString());
		
		l.push(90);
		System.out.println(l.toString());
		//remove and pop are equivalent both uses the removeFirst function and NosuchElementException 
		// are throw when the list is empty
		System.out.println(l.pop());
		System.out.println(l.toString());
		System.out.println(l.remove());
		//retrives and remove first element of the list if list is emplty 'Null' Is returned
		System.out.println(l.poll());
		
		System.out.println(l.peek());//retrives the first ele and null if list is empty
		System.out.println(l.element());//retrives the first ele and NoSuchElement Exception if lis is null 
		System.out.println(l.toString());
		
		
		

	}

}

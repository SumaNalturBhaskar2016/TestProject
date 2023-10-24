package com.practice.collection;

public class demoRunnableClass {

	public static void main(String[] args) {
		
		Thread t1= new Thread(new demoRunnable());
		Thread t2= new Thread(new demoRunnable());
		t1.start();	
		t2.start();	
		
		
		
	}
	
}

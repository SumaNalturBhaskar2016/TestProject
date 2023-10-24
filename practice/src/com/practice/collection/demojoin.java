package com.practice.collection;

public class demojoin  {
	private static int  count=0;
	
	public static synchronized void inaccount() { ///sycronized  keywored 
	
		count++;  ///used by only one thread by at a time
	}
	public static void main(String[] args) {
		
		Thread t1= new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					inaccount();
				}
				
			}
			
		});
		
		
		
       Thread t2= new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10000;i++) {
					inaccount();
				}
				
			}
			
		});
       
       t1.start();
       t2.start();
       try {
		 t1.join();// waits for the thread to die
		 t2.join();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
       System.out.println(count);
		
	}

	
}

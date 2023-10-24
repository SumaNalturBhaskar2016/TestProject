package com.practice.collection;

public class demoRunnable  implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println(i+"i am Runnable");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	
}
 
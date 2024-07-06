package com.practice.code;

public class sumOfAjacent {
	public static void main(String[] args) {
		
		
		int[] a= new int[]{1,2,3,4,5};
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			
			sum=sum+a[i]+a[i+1];
			
		}
		
		System.out.println("sum"+sum);
		
		
	}
	
	

}

package com.practice.code;



public class findMinWithoutBinary {
	
	
	public static void main(String[] args) {
		
		int[] a= new int[] {5,6,1,2,3,4};
		
		int min=a[0];
		
		for(int i=1 ;i<a.length;i++) {
			
			if(a[i]<min) {
				min=a[i];
			}
		}
		
		System.out.println("min   "+min);
		
	}
	
	

}

package com.practice.code;

public class secondSmallest {
	
	public static void main(String[] args) {
		
		
		int[] a= new int[] {5,4,4,7};
		
		int smallest=a[0];
		int sSmallest= Integer.MAX_VALUE;
		
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest) {
				sSmallest=smallest;
				smallest=a[i];
			}
			else if(a[i]<=sSmallest && a[i]!=smallest) {
				System.out.println("sumaaa");
				
				sSmallest=a[i];
			}
			
		}
		
		System.out.println(sSmallest);
		
		
		
		
	}	
	

}

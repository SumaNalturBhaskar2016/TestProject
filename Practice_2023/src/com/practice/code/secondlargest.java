package com.practice.code;

public class secondlargest {
	
	
	public static void main(String[] args) {
		
		int[] a= new int[] {4,5,6,7,7};
		
		int largest=Integer.MIN_VALUE;// a[0]
		int sLargest= Integer.MIN_VALUE;// -1
		
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				sLargest=largest;
				largest=a[i];
			}
			else if(a[i]<largest && a[i]>sLargest) {
				sLargest=a[i];
			}
			
			
		}
		
		System.out.print(sLargest);
	}


}

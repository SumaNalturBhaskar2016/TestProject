package com.practice.code;

public class findMinWithBinary {
	
	
	
	public static void main(String[] args) {

		int[] a= new int[] {4,5,6,7,0,1,2};
		
		int first=0;
		int last=a.length-1;
		
		
		while(first<last) {
			int mid=(first+last)/2;
			
			if(a[mid]<a[last]) {
				last=mid;
			}
			else {
				first=mid+1;
			}
			
			
			
		}
		System.out.print("minium elements  "+a[first]);
		
	}
	
	

}

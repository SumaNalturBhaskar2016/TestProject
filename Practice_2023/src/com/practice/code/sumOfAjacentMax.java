package com.practice.code;

public class sumOfAjacentMax {

	
	public static void main(String[] args) {
		int[] a= new int[] {1,2,3,4,5};
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++) {
			sum=a[i]+a[i+1];
		
		if(sum>maxSum) {
			maxSum=sum;
		}
		}
		System.out.println(maxSum);
		
	}
}

package com.practice.code;

public class MaxSubArray {

	
	
	
	
	public static void main(String[] args) {
		
		int[] a= new int[] {-1,3,4,-2};
		int sum=a[0];
		int maxSum=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			sum=Math.max(a[i], sum+a[i]);
			maxSum= Math.max(maxSum, sum);
			
		}
		
		System.out.println(maxSum);
	}
	
}

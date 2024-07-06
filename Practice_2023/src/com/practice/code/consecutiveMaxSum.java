package com.practice.code;

public class consecutiveMaxSum {
	
	// find the max sum
	
	public static void main(String[] args) {
		int[] a = new int[] {3,2,5,4,1};
		int sum=0;
		int k=2;
		for(int i=0;i<k;i++) {
			sum=sum+a[i];
		}
		
		int max_sum= sum;
		int start =0;
		for(int i=k;i<a.length;i++) {
			sum= sum+a[i]-a[start++];
			if(sum>max_sum) {
				max_sum=sum;
			}
		}
		
		System.out.print(max_sum);
		
	}

}

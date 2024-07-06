package com.practice.code;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
	
	public static void main(String[] args) {
		int n=3;
		int[] a= new int[] {1,4,3};
		int[] nge = new int[n];
	
		Stack<Integer> s= new Stack<>();
		int j=0;
		
		for(int i= n-1;i>=0;i++) {
			while(!s.isEmpty() && a[i]>=s.peek() ) {
				s.pop();
			}
			if(s.isEmpty()) {
				nge[j]=-1;
			}
			else {
				nge[j]=a[i];
			}
			
			s.push(a[i]);
			
		}
		
		Arrays.stream(nge).forEach(System.out::println);
		
		//1 4 3 array
		 // 4  -1 -1  nge
		      //  4  stack
		 // 0 1 2  index
		
		
		
		
		
		
	}
	

}

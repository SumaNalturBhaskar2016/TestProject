package com.practice.code;

import java.util.Arrays;
import java.util.Stack;

public class CircularArrayGreatestElementd {
	
	
	public static void main(String[] args) {
		int n=3;
		int[] a= new int[] {1,4,3};
		int [] newarr= new int[2*n];
		int[] nge = new int[n];
		
		
		for(int i=0;i<2*n;i++) {
			
			newarr[i]=a[i%n];
			
		
		}
		
		
		Stack<Integer> s= new Stack<>();
		//1 4 3 1 4 3
		for(int i=2*n-1; i>=0;i--) {
			while(!s.isEmpty() && newarr[i%n]>=s.peek()) {
				s.pop();
			}
			
			if(i<n) {
			
			if(s.isEmpty()) {
				nge[i]=-1;
			}
			else {
				nge[i]=s.peek();
			}
			
			}
			
			s.push(newarr[i%n]);
			
		}
		
		System.out.println("heee");
		
		for(int i=0;i<2*n;i++) {
			System.out.print(newarr[i]);
		}
		System.out.println("sumammm");
		Arrays.stream(nge).forEach(System.out::println);
		
	}

	
	

}

package com.practice.code;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterEleUsingStack {
	
	
	
	public static void main(String[] args) {
		
		
		int[] arr= new int[] {1,4,3};
		int n=arr.length;
		int[] nge = new int[n];
		
		
		
		Arrays.fill(nge, -1);
		
		Stack<Integer> s=new Stack<>();
		int j=0;
		for(int i=0;i<arr.length;i++) {
			while(!s.isEmpty() && arr[i]>=s.peek()) {
				s.pop();
				nge[j]=arr[i];
				j++;		
		}
		s.push(arr[i]);
	}
  Arrays.stream(nge).forEach(System.out::println);
}
}

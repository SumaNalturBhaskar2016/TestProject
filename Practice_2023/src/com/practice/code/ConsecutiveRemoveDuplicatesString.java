package com.practice.code;

import java.util.Stack;

public class ConsecutiveRemoveDuplicatesString {

	
	public static void main(String[] args) {
		
		
		String str="abbaca";
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			if(!stack.isEmpty() && stack.peek()==str.charAt(i)) {
				stack.pop();
			}
			else {
				
				stack.push(str.charAt(i));
			}
			
			
			
		}
		
		StringBuilder s= new StringBuilder();
		while(!stack.isEmpty()) {
			s.append(stack.pop());
		}
				
	System.out.println(s.reverse().toString());	
}
	
}	

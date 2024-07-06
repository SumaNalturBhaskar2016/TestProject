package com.practice.code;

import java.util.Stack;

public class balancedbrackets {
	
	
	
	public static void main(String[] args) {
		String s1="{()}";
		String s2="";
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s1.length();i++) {
			
			if(s1.charAt(i)=='{'|| s1.charAt(i)=='(' || s1.charAt(i)=='[' ) {
				
				stack.push(s1.charAt(i));
				
			}
			
			else {
			if ((s1.charAt(i) == '}' && stack.peek() == '{') || (s1.charAt(i) == ')' && stack.peek() == '(')
					|| (s1.charAt(i) == ']' && stack.peek() == '[')) {
			
				stack.pop();
			}
			else {
				
				stack.push(s1.charAt(i));
			}
				
		}
			
		}		
		
		if(stack.isEmpty()) {
			System.out.println("it is balanced");
		}
		
		else {
			System.out.println("un balanced");
		}
	}
	

}

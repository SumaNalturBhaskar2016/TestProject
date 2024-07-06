package com.practice.code;

public class ReverseStringNotSpecialChar {
	
	
	public static void main(String[] args) {
		
		String str="s,uma";
		int start=0;
		int last=str.length()-1;
		 char[] c=str.toCharArray();
		
		while(start<last) {
			
			if(!Character.isAlphabetic(c[start])) {
				start++;
			}
			else if(!Character.isAlphabetic(c[last])) {
				last--;
			}
			else {
				//swap
				char temp=c[start];
				c[start]=c[last];
				c[last]=temp;
				start++;
				last--;
			}
			
		}
		
		System.out.print(new String(c));
	}
	
}

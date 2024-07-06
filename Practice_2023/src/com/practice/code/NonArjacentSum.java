package com.practice.code;

public class NonArjacentSum {
	
	
public static void main(String[] args) {
	int[] a= new int[] {3, 2, 7, 10};
	int include=0;
	int exclude=0;
	
	for(int i=0;i<a.length;i++) {
		
		int newInclude=exclude+a[i];
		exclude=Math.max(include,exclude);
		include=newInclude;
	}
	
	System.out.print(Math.max(include, exclude));
}
    
    
    
    
    
    
    
    
    
    
    
    

}

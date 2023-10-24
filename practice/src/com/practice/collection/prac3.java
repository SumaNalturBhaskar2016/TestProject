package com.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class prac3 {

	
	
	public static void main(String[] args) {
		
		int a[]= new int[90];
		
		Scanner sc= new Scanner(System.in);
		int p= sc.nextInt();
		int x=sc.nextInt();
		int z=sc.nextInt();
		
		
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
			
		}
		
		List<Integer> l =new ArrayList<>();
		for(int i=0;i<5;i++) {
			if(a[i]%x==z) {
				l.add(a[i]);
			}
			
		}
		
		Collections.sort(l);
	
		int res = l.get(p-1);
	  for(int i=0;i<5;i++) {
		if(a[i]==res)
		{
			System.out.println(i);
		}
	}
		
		
	}
}

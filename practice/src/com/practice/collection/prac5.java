package com.practice.collection;

import java.util.Arrays;
import java.util.Scanner;

public class prac5 {

	public static void main(String[] args) {
		System.out.println("ënyer the array");
		Scanner sc = new Scanner(System.in);
		int start=0;
		int end=0;
		int a[] = new int[10];
		for (int i = 0; i < 6; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("split size");
		System.out.println("e"+a.length);
		int splitSize= sc.nextInt();
		while(start<a.length) {
			end = end+splitSize;
			int arry[]=Arrays.copyOfRange(a, start, end);
			System.out.println(Arrays.toString(arry));
			start= end;
			
		}
	
		
		
	}

}

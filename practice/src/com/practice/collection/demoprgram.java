package com.practice.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class demoprgram {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int p=sc.nextInt();
		int q=sc.nextInt();
		
		int[][] arr1= new int[m][n];
		int[][] arr2= new int[p][q];
		int[][] c= new int[m][q];
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]=sc.nextInt();
			}	
		}
		
		
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
				arr2[i][j]=sc.nextInt();
			}	
		}
		
		

		for(int i=0;i<n;i++) {
			for(int j=0;j<q;j++) {
				int sum=0;
				for(int k=0;k<p;k++) {
					
					sum= sum+arr1[i][k]*arr2[k][j];
				}
				
				c[i][j]=sum;
			}	
		}
		
		for(int i=0;i<p;i++) {
			for(int j=0;j<q;j++) {
			 System.out.print(c[i][j]+" ");
			
			}
			 System.out.println();
		}
		
}
}	
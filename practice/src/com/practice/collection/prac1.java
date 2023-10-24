package com.practice.collection;

import java.util.Scanner;

public class prac1 {
	
	public static void main(String[] args) {
		
		int m=2,n=3;
		int a[][]= new int[90][90];
		 int[][] b;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		 
		if(m>n){	
			 b=new int[m][m];
			
			for(int i=0;i<m;i++) {
				for(int j=0;i<m;j++) {
					b[i][j]=a[i][j];
	               if(a[i][j]== 0) {
						b[i][j]=1;
					}	
				}
				 n=m;
			}
		}
		
		if(m<n){
			 b =new int[n][n];
			
			for(int i=0;i<n;i++) {
				for(int j=0;i<n;j++) {
					b[i][j]=a[i][j];
					if(a[i][j]== 0) {
						b[i][j]=1;
					}
				}
				 m=n;
			}
		}
		
		
		int sum=0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
			
				if(i==j ) {
					sum=sum+a[i][j];
				}
			}
		}
		
		System.out.println(sum);
		
	}
	
	

}


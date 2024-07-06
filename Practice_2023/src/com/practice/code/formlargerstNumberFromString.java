package com.practice.code;

import java.util.Arrays;
import java.util.Comparator;

public class formlargerstNumberFromString {
	
	public static String getMaximum(String[] strarray) {
		
		Comparator<String> comp=new Comparator<String>() {
			
			@Override
			public int compare(String a, String b) {
				String ab=a+b;
				String ba=b+a;
				int p= ba.compareTo(ab);
				return p;
			}
		};
		
		Arrays.sort(strarray,comp);
		
		StringBuilder sb=new StringBuilder();
		for(String num:strarray) {
			sb.append(num);
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String[] strarray= {"9","98","2","1"};
		String result=getMaximum(strarray);
		System.out.print(result);
	}

}

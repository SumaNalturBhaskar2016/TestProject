package com.practice.code;

public class binarySearchForParitailSortedArray {
	
 // 1 2 3 4 5 6 7
// 7 6 5 4 1 2 3
	
 //4 5 6 7 0 1 2
 public static void main(String[] args) {
	 int[] a= new int[] {4,5,6,7,1,2,3};
	 int first=0;
	 int last=a.length-1;
	 int target=4;
	 while(first<=last) {
		 int mid=(first+last)/2;
		 
		 if(a[mid]==target) {
			 System.out.print(mid); 
		 }
		
		 if(a[first]<=a[mid]) {
			 
			 if(target<a[mid] && a[first]<=target) {
				 last=mid-1;
			 }
			 else {
				 first=mid+1;
			 }
			 
			 
		 }
		 else {
			 if(a[mid]<target && target<=a[last]) {
				 first= mid+1;
			 }
			 else {
				 last=mid-1;
			 }
		 }
		 
	 }
	 
}

}

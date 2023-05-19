package com.BasicArray;

public class SumOfArray {

	public static void main(String[] args) {
		int[] a= {55,33,66,66,44,77,55,88,11};
		
		int sum=0;
		
		for(int i=0; i<a.length; i++) {
		sum+=a[i];	
		}
		System.out.println("Sum of all the elements in an array: "+sum);
	}
}

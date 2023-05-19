package com.BasicArray;

public class ReverseArray {

	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,0};
		
		//New Array
		 int[] rarr= new int[arr.length];
		 	
		int sum=0;
		
		
		for(int i=arr.length-1; i>=0; i--) {
			
			rarr[sum]=arr[i];	
					sum++;
		}
		
		System.out.println("The new array is:");
		for(int i=0; i<arr.length; i++)
		
		{
			System.out.println(rarr[i]);
		}
		
	}
}

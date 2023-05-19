package com.BasicArray;

public class PrintDuplicates {
//pending
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {55,33,66,66,44,77,55,88,11};
		
		System.out.println("The duplicates are:");
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
		
		
		int sum=0;
		int[] b= new int[a.length];
		System.out.println("After removing the duplicates:");
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]!=a[j]) {
					b[sum]=a[i];
					sum++;
				}
			}
		}
		
for(int i=0; i<b.length; i++) {
	System.out.println(b[i]);
}
	}

}

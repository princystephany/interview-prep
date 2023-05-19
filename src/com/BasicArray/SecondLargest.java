package com.BasicArray;

public class SecondLargest {

	public static void main(String[] args) {
		
		
		int[] a= {55,33,66,44,77,88,11};

		int temp=0;
		
		
	
		for (int i = 0; i <a.length; i++)   
        {  
            for (int j = i + 1; j < a.length; j++)   
            {
            	
            	if(a[i]>a[j]) {
            		temp=a[i];
            		a[i]=a[j];
            		a[j]=temp;
            		
            		
            	}
            }
        }
	for(int i=0; i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println("SecondSmallest:"+a[1]);

	
	System.out.println("SecondLargest:"+a[a.length-2]);
}
	
	
	
}

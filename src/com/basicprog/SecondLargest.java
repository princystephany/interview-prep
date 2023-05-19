package com.basicprog;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp;
		
		int a[]={44,66,99,77,33,22,55};
		
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
		
		for (int i = 0; i <a.length; i++) {
			
			
			System.out.print(" "+a[i]);
			
			
		}
		System.out.println();
		
		System.out.println(a[a.length-2]);
		}
	}



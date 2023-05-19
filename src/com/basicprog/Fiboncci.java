package com.basicprog;

import java.util.Scanner;

public class Fiboncci {

	
	public static void main(String[] args) {
		
		
	Scanner sc= new Scanner(System.in);
		System.out.println("Give input :");
		
		int num =sc.nextInt();
		
		int temp1 = 0;
		int temp2 = 1;
		int store=0;
		
		while (num>0) {

			 store=temp1;
			 
			temp1= temp2;

			temp2 = temp2+store;

			System.out.print(store+" " );

			num--;
			
		}
		
		
	}
}

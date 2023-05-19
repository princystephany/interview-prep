package com.BasicArray;

import java.util.Iterator;
import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		
		
		//Pattern 1
		
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		1 2 3 4 5 6 
//		1 2 3 4 5 6 7 
//		1 2 3 4 5 6 7 8 
//		1 2 3 4 5 6 7 8 9 
//		1 2 3 4 5 6 7 8 9 10 
		
		
		/*
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.println("Give input:");
		 * 
		 * int num = sc.nextInt();
		 * 
		 * int sum= 1;
		 * 
		 * while(sum<=num) { for(int i=1; i<=sum; i++) {
		 * 
		 * System.out.print(i+" "); } sum++; System.out.println(); }
		 */
		
		//Pattern 2
		
//		 1
//		 2 3
//		 4 5 6
//		 7 8 9 10
//		 11 12 13 14 15
		 
		 Scanner sc = new Scanner(System.in);
		 
		  System.out.println("Give input:");
		 
		  int num = sc.nextInt();
		  
		  int sum=1;
		  
		  for(int i=0; i<=num; i++) {
			  for(int j=0; j<=i; j++) {
				  System.out.print(" "+sum);
				  sum++;

			  }
			  System.out.println();

		}
		 

		
	}

}

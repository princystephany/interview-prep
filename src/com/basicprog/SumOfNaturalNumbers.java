package com.basicprog;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	
	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Give the input:");
		
		int num = sc.nextInt();
		
		int sum=0;
		
		for(int i =0; i <= num; i++) {
			
			sum+=i;
		}
		System.out.println(sum);
	}
}

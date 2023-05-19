package com.basicprog;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give input :");
		int number=sc.nextInt();
		
		boolean flag= false;
		
		for(int i =2;i<number;i++) {
			
			if(number%i==0) {
				flag=true;
			}
			
		}
		
		if(!flag) {
			System.out.println("not-prime");
		}
		else {
			System.out.println("prime");
		}
	}
}

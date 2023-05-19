package com.basicprog;

import java.util.Scanner;

public class PrimeNumbersTill {
	//pending
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give a number:");
		
		int num = sc.nextInt();
		
		for(int i=2; i<=num; i++) {
			
			for(int j=2; j<=num/2; j++) {
				if(i%j == 0)
				{
					System.out.println(i);
				}
			}
		}
	}

}

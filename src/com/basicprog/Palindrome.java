package com.basicprog;

import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
System.out.println("Give input :");
		int num =sc.nextInt();
		
		int temp= num;
		
		int sum=0;
		
		int rev=0;
		
		while(num>0) {
			
 			
		sum=num%10;
		
		rev=rev*10+sum; 
		 
		num=num/10;
		
		}
		
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}

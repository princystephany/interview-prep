package com.interest;

import java.util.Scanner;

public class Investment{

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		SimpleInterest si= new SimpleInterest();
		CompoundInterest ci=new CompoundInterest();


		System.out.println("Please enter the Fixed Deposit Amount");
		double p= sc.nextDouble();

		System.out.println("“Please enter the Duration of deposit in years");
		double n= sc.nextDouble();

		double r= 6.5;

		System.out.println("is interest cumulative or simple?”");

		String comment=sc.next();

		if(comment.equals("cumulative")) {
			System.out.println("The CI is:");
			ci.calculateInterest(p, n, r);

		}

		else if(comment.equals("simple")) {
			System.out.println("The SI is:");
			si.calculateInterest(p, n, r);

		}

		else {
			System.out.println("Give a valid command");
		}

	}
}
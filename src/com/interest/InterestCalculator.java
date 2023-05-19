package com.interest;

public interface InterestCalculator {

void calculateInterest(double p,double n,double r);
		
	}
	
class SimpleInterest implements InterestCalculator{

	@Override
	public void calculateInterest(double p, double n, double r) {
		System.out.println("SI :"+(p*n*r)/100);
	}
//	 
		
}

class CompoundInterest implements InterestCalculator{

@Override
public void calculateInterest(double p, double n, double r) {
		System.out.println("Ci :"+p *(Math.pow((1 + r / 100), n)));
}
 
}
 
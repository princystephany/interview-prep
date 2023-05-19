package com.string;

public class ToUpperAndLower {
public static void main(String[] args) {
	String str= "Converting to Upper and Lower";
	
	System.out.println("Oringinal String: "+str);
	
	str= str.toUpperCase();
	
	System.out.println("After coonverting to upper case: "+str);
	
	str= str.toLowerCase();
	
	System.out.println("After converting to lower case: "+ str);
}
}

package com.string;

public class PalindromeOfStrings {
public static void main(String[] args) {
	
	String  str1 = "malayalam";
	String  str2 = "malay";
	
	boolean flag=true;
	
	for(int i=0; i<str2.length();i++) {
		if(str2.charAt(i)!=str2.charAt(str2.length()-i-1)){
			flag=false;
		}
	}

	if(flag) {
		System.out.println("It is a palindrome");
	}
	else{
		System.out.println("It is not a palindrome");
	}
	
}
}

package com.string;

public class CountChar {
public static void main(String[] args) {
	
	String a="Paulo Coelho";
	int count=0;
	for(int i=0;i<a.length();i++) {
	if(a.charAt(i)!=' ') {
		count++;
	}
	}
	System.out.println("The total number of characters in the string:"+count);
	
}
}

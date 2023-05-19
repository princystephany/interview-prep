package com.string;

public class RemoveSpace {
	public static void main(String[] args) {
		
		String str="Arunthathi Roy Chandran";
		
		//str=str.replaceAll(" ", "");
	 		str=str.replaceAll("\\s+", "");

		System.out.println(str);
	}

}

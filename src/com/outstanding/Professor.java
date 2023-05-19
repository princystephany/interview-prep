package com.outstanding;

public class Professor extends Person {
  
	int booksPublished;
	
	public Professor() {
		
	}
	public Professor(String name, int booksPublished ) {
		
	}
	
	
	public void print() {
		
		System.out.println(name);
		System.out.println(book);
	}
	
	public boolean isOutstanding() {
		return false;
		
	}
}

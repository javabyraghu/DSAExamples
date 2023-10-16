package com.app.recursion;

public class PrintNameNTimes {

	private static int count = 1;
	
	public static void main(String[] args) {
		printName("AJAY");
	}

	private static void printName(String name) {
		System.out.println(name);
		if(count == 3)
			return;
		count++;
		printName(name);
	}
}

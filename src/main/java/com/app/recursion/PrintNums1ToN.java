package com.app.recursion;

public class PrintNums1ToN {

	private static int count = 1;
	
	public static void main(String[] args) {
		int n = 3;
		prinNums(n);
	}

	private static void prinNums(int n) {
		System.out.println(count);
		if(count == n)
			return;
		count++;
		prinNums(n);
	}
}

package com.app.recursion;

public class PrintNumsNTo1 {

	private static int count = 3;
	
	public static void main(String[] args) {
		prinNums();
	}

	private static void prinNums() {
		System.out.println(count);
		if(count == 1)
			return;
		count--;
		prinNums();
	}
}

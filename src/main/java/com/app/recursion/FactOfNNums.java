package com.app.recursion;

public class FactOfNNums {
	
	public static void main(String[] args) {
		int n = 5;
		int sum = getFact(n);
		System.out.println(sum);
	}

	private static int getFact(int n) {
		if(n==1)
			return 1;
		return n * getFact(--n);
	}
}

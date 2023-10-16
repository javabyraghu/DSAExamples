package com.app.recursion;

public class SumOfNNums {
	
	public static void main(String[] args) {
		int n = 5;
		int sum = getSum(n);
		System.out.println(sum);
	}

	private static int getSum(int n) {
		if(n==1)
			return 1;
		return n + getSum(--n);
	}
}

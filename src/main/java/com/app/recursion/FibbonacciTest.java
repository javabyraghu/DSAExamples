package com.app.recursion;

public class FibbonacciTest {
	
	static int current = 1;
	static int previous = 0;
	public static void main(String[] args) {
		int n = 10;
		System.out.print(previous +" " + current +" ");
		printFibbonacci(n);
	}

	private static void printFibbonacci(int n) {
		int next = current + previous;
		if(next >= n) return;
		System.out.print(next+" ");
		previous = current;
		current = next;
		printFibbonacci(n);
		
	}

	
}

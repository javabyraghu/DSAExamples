package com.app.raghu.array;

public class ArrayMissingElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9 };
		findMissingElement(arr);
	}

	private static void findMissingElement(int[] arr) {
		int N = arr.length + 1;
		int sum = (N * (N + 1)) / 2;
		for (int e : arr) {
			sum -= e;
		}
		System.out.println("Missing Element " + sum);
	}
}

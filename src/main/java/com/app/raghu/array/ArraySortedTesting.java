package com.app.raghu.array;

public class ArraySortedTesting {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 16, 22, 41, 80 };
		boolean sorted = isArraySorted(arr);
		System.out.println(sorted);
	}

	private static boolean isArraySorted(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i])
				return false;
		}
		return true;
	}
}

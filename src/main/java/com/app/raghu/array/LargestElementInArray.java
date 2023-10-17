package com.app.raghu.array;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 2, 31, 45, 9, 12, 61, 34, -98 };
		int element = largetElememt(arr);
		System.out.println(element);
	}

	private static int largetElememt(int[] arr) {
		int large = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > large)
				large = arr[i];
		}
		return large;
	}
}

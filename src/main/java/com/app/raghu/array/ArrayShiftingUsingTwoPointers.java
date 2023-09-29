package com.app.raghu.array;

public class ArrayShiftingUsingTwoPointers {

	// we can use two pointers concept to shift array elements
	public static void main(String[] args) {
		int[] arr = { 100, 95, 34, 56, 78, 90 };
		rotate(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void rotate(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
	}
}

package com.app.raghu.array;

public class ArrayRemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		int[] arr = { 10, 10, 22, 22, 34, 56, 56, 60, 60, 72, 72 };
		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[i] != arr[j]) {
				arr[++i] = arr[j];
			}
		}
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println("\nUnique Elements are :" + i);
	}
}

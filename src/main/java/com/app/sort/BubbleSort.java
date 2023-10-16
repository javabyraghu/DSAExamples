package com.app.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 10, 23, 45, 67, 8, 9, 12 };
		doBubbleSort(arr);
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}

	private static void doBubbleSort(int[] arr) {
		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {
			boolean swapped = false;

			for (int j = 0; j < len - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
					swapped = true;
				}
			}

			if (swapped == false)
				break;
		}
	}

	private static void swap(int[] arr, int j) {
		int tmp = arr[j];
		arr[j] = arr[j + 1];
		arr[j + 1] = tmp;
	}

}

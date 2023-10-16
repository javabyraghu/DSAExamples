package com.app.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 10, 23, 45, 67, 8, 9, 12 };
		doSelectionSort(arr);
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}

	private static void doSelectionSort(int[] arr) {
		int len = arr.length;

		for (int i = 0; i < len - 1; i++) {
			int minIndex = i;
			for (int j = i; j < len; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}

			swap(arr, i, minIndex);
		}
	}

	private static void swap(int[] arr, int i, int minIndex) {
		int tmp = arr[i];
		arr[i] = arr[minIndex];
		arr[minIndex] = tmp;
	}
}

package com.app.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 10, 12, 45, 6, 78, 9, 11 };
		doQuickSort(arr, 0, arr.length - 1);
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

	private static void doQuickSort(int[] arr, int low, int high) {
		if (low < high) {
			int partition = partitionKey(arr, low, high);

			doQuickSort(arr, low, partition - 1);
			doQuickSort(arr, partition + 1, high);
		}
	}

	private static int partitionKey(int[] arr, int low, int high) {
		int pivote = arr[low];
		int i = low;
		int j = high;

		while (i < j) {
			while (arr[i] <= pivote && i <= high - 1) {
				i++;
			}
			while (arr[j] > pivote && j >= low + 1) {
				j--;
			}
			if (i < j)
				swap(arr,i,j);
		}
		swap(arr,low,j);
		return j;
	}

	private static void swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}

package com.app.sort;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = { 10, 23, 4, 35, 66, 56, 12, 8, 9 };
		doMergeSort(arr, 0, arr.length - 1);
		for (int e : arr)
			System.out.print(e +" ");
	}

	private static void doMergeSort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;

		doMergeSort(arr, low, mid);
		doMergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		//ArrayList<Integer> temp = new ArrayList<>();
		int[] temp = new int[high - low + 1 ]; // (mid-low) + (high - mid+1) 
		int tempIndex = 0;
		int left = low;
		int right = mid + 1;

		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp[tempIndex] = arr[left];
				left++;
			} else {
				temp[tempIndex] = arr[right];
				right++;
			}
			tempIndex++;
		}
		// copy remaining elements
		while (left <= mid) {
			temp[tempIndex++] = arr[left];
			left++;
		}
		while (right <= high) {
			temp[tempIndex++] = arr[right];
			right++;
		}
		// copy back to original array
		for (int i = low; i <= high; i++) {
			arr[i] = temp[i - low];
		}

	}
}

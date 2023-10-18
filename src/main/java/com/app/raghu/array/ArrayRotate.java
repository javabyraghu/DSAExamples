package com.app.raghu.array;

public class ArrayRotate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5};
		// rotateLeftByOne(arr);
		int k = 3;
		// rotateLeftByK(arr, k);
		// rotateLeftByKUsingTempArray(arr, k);
		rotateLeftByKUsingReverseArray(arr, k);
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

	private static void rotateLeftByKUsingReverseArray(int[] arr, int k) {
		int n = arr.length ;
		k = k % n;
		//for left shift
		if(k > 0) {
			reverse(arr, 0 , k-1);
			reverse(arr, k , n-1);
			reverse(arr, 0 , n-1);
		}
		//for right shift
		/*reverse(arr, n-k, n-1);
		reverse(arr, 0, n-k-1);
		reverse(arr, 0, n-1);*/

	}

	private static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

	private static void rotateLeftByKUsingTempArray(int[] arr, int k) {
		int n = arr.length;

		int[] temp = new int[k];
		// copy elements to temp array from zero to k
		for (int i = 0; i < k; i++) {
			temp[i] = arr[i];
		}
		// shift kth element to zero upto n
		for (int i = k; i < n; i++) {
			arr[i - k] = arr[i];
		}
		// copy temp elements from (n-k) to n
		for (int i = n - k; i < n; i++) {
			arr[i] = temp[i - (n - k)];
		}
	}

	private static void rotateLeftByK(int[] arr, int k) {
		while (k > 0) {
			int tmp = arr[0];
			for (int i = 1; i < arr.length; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = tmp;
			k--;
		}
	}

	private static void rotateLeftByOne(int[] arr) {
		int tmp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			arr[i - 1] = arr[i];
		}
		arr[arr.length - 1] = tmp;
	}
}

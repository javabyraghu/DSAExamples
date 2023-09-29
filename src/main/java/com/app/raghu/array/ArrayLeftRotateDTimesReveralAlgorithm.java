package com.app.raghu.array;

import java.util.Arrays;

public class ArrayLeftRotateDTimesReveralAlgorithm {

	public static void main(String[] args) {
		int[] arr = { 10, 11, 23, 45, 67, 90 };
		int d = 5;
		leftRotate(arr, d);
		System.out.println(Arrays.toString(arr));
	}

	// The Reversal Algorithm
	private static void leftRotate(int[] arr, int d) {
		int n = arr.length;
		// if d is greater then n;
		d = d % n;
		if (d != 0) {
			reverse(arr, 0, d - 1);
			reverse(arr, d, n - 1);
			reverse(arr, 0, n - 1);
		}
	}

	private static void reverse(int[] arr, int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

}

package com.app.raghu.array;

public class ArrayMoveZerosToEnd {

	public static void main(String[] args) {
		// int[] arr = { 10, -1, 5, 6, 7, -1, 19, -1, -1 };
		int[] arr = { 10, 0, 5, 6, 0, 7, 0, 19, 0, 0 };
		// moveZerosToEndUsingTemp(arr);
		moveZerosToEnd(arr);
		for (int e : arr) {
			System.out.print(e + " ");
		}
	}

	//if Ith position is zero and Jth position is non zero then swap
	// else move pointers to next elements
	private static void moveZerosToEnd(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[i] == 0 && arr[j] != 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			if (arr[i] != 0)
				i++;
			if (arr[j] == 0)
				j--;
		}
	}

	// insted of zeros -- i have tested even -ve or specific number too
	private static void moveZerosToEndUsingTemp(int[] arr) {
		int n = arr.length;
		int[] temp = new int[n];

		int index = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != -1) {
				temp[index++] = arr[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (temp[i] != 0)
				arr[i] = temp[i];
			else
				arr[i] = -1;
		}
	}
}

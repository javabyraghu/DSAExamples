package com.app.raghu.array;

import java.util.Arrays;

public class TwoSumUsingTwoPointers {

	public static void main(String[] args) {
		int[] arr = { 10, 23, 45, 60, 90 };
		//**elements must be sorted if not**
		Arrays.sort(arr);
		int sum = 70;
		int[] positions = twoSum(arr, sum);
		System.out.println(positions[0] + " " + positions[1]);
	}

	private static int[] twoSum(int[] arr, int sum) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] == sum)
				return new int[] { i, j };
			else if (arr[i] + arr[j] > sum)
				j--;
			else
				i++;
		}
		return null;
	}
}

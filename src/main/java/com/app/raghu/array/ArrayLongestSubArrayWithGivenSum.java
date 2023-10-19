package com.app.raghu.array;

public class ArrayLongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 1, 1, 1, 1 };
		int k = 5;
		int len = findMaxLengthSubArray(arr, k);
		System.out.println("Lognest Sub Array is " + len);
	}

	private static int findMaxLengthSubArray(int[] arr, int k) {
		int i = 0, j = 0, mLen = 0, sum = arr[i];
		int N = arr.length;
		while (j < N) {
			while (i <= j && sum > k)
				sum -= arr[i++];

			if (sum == k)
				mLen = Math.max(mLen, j - i + 1);

			j++;
			if (j < N)
				sum += arr[j];
		}
		return mLen;
	}
}

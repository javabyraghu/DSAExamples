package com.app.raghu.array;

public class GoogleSlidingWindowMaxSubArraySum {

	public static void main(String[] args) {
		int[] arr = {10,2,3,10,6,0,8,-4};
		int k = 3;
		int sum  = maxSubArraySum(arr,k);
		System.out.println(sum);
	}

	//first find k elements sum
	//then remove ith position value and add i-kth value
	private static int maxSubArraySum(int[] arr, int k) {
		int wSum = 0;
		int mSum = 0;
		int len = arr.length;
		for (int i = 0; i < k; i++) {
			mSum+=arr[i];
		}
		wSum = mSum;
		for(int i = k ; i <  len ; i++) {
			wSum += arr[i] - arr[i-k];
			mSum = Math.max(mSum, wSum);
		}
		return mSum;
	}
}

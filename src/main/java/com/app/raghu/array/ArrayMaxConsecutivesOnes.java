package com.app.raghu.array;

public class ArrayMaxConsecutivesOnes {

	public static void main(String[] args) {
		int[] arr = {1,0,1,1,1,0,1,1,0,1};
		int N  = arr.length-1;
		findMaxConsecutivesOnes(arr, N);
	}

	private static void findMaxConsecutivesOnes(int[] arr, int N) {
		int mCount=0 , cCount = 0;
		for (int i = 0; i < N; i++) {
			if(arr[i]==1) {
				cCount++;
			} else {
				mCount = Math.max(cCount, mCount);
				cCount = 0;
			}
		}
		System.out.println("Max Count is " + mCount);
	}
}

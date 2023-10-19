package com.app.raghu.array;

public class ArrayElementAppearsOnce {

	public static void main(String[] args) {
		int[] arr = {1,1,2,3,3,4,4,5,5};
		getOneOccuranceElement(arr);
	}

	private static void getOneOccuranceElement(int[] arr) {
		int N = arr.length;
		int i = 1;
		int element = arr[0];
		while( i < N) {
			element ^=arr[i++];
		}
		System.out.println("Element that appears once is " + element);
	}
}

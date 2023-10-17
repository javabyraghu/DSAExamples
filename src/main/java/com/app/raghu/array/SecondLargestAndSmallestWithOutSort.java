package com.app.raghu.array;

public class SecondLargestAndSmallestWithOutSort {

	public static void main(String[] args) {
		int[] arr = { -5, 2, 4, 55, 46, 21, 48, 36, 0 };
		int element = find2ndLargeElement(arr);
		int[] elements = find2ndLargeAndSmallElement(arr);
		System.out.println(element);
		System.out.println(elements[0] + " " + elements[1]);
	}

	private static int[] find2ndLargeAndSmallElement(int[] arr) {
		int flarge = arr[0];
		int fsmall = arr[0];
		int ssmall = Integer.MAX_VALUE;
		int slarge = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			// 2nd large
			if (arr[i] > flarge) {
				slarge = flarge;
				flarge = arr[i];
			} else if (arr[i] < flarge && arr[i] > slarge) {
				slarge = arr[i];
			}
			// 2nd small
			if (arr[i] < fsmall) {
				ssmall = fsmall;
				fsmall = arr[i];
			}
			if (arr[i] > fsmall && arr[i] < ssmall) {
				ssmall = arr[i];
			}
		}

		return new int[] { ssmall, slarge };
	}

	private static int find2ndLargeElement(int[] arr) {
		int large = arr[0];
		int slarg = Integer.MIN_VALUE;
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (arr[i] > large) {
				slarg = large;
				large = arr[i];
			} else if (arr[i] < large && arr[i] > slarg) {
				slarg = arr[i];
			}
		}
		return slarg;
	}
}

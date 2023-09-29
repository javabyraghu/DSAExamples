package com.app.raghu.array;

/***
 * Find Sum of elements which gives min sum 
 * and which gives max sum
 */
public class ArrayMinSumAndMaxSum {

	public static void main(String[] args) {
		int arr[] = {10,4,5,2,9};
		
		int min = arr[0];
		int max = arr[0];
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
			
			sum+= arr[i];
		}
		System.out.println(min);
		System.out.println(max);
		System.out.println("Min Sum = " + (sum-max));
		System.out.println("Max Sum = " + (sum-min));
	}
	
}

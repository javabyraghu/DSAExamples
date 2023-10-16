package com.app.recursion;

public class ArrayReverse {
	
	public static void main(String[] args) {
		int[] n = {10,12,34,56,89};
		revArr(n,0,n.length-1);
		for(int i:n) {
			System.out.print(i+" ");
		}
	}

	private static void revArr(int[] n,int start,int end) {
		if( start == end)
			return;
		swap(n,start,end);
		revArr(n, start+1, end-1);
	}

	private static void swap(int[] n, int start, int end) {
		int temp = n[start];
		n[start] = n[end];
		n[end] = temp;
	}
}

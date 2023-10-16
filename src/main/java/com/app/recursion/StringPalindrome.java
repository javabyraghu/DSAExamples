package com.app.recursion;

public class StringPalindrome {
	
	public static void main(String[] args) {
		String str = "madam";
		char[] arr = str.toCharArray();
		revArr(arr,0,arr.length-1);
		String newStr = String.valueOf(arr);
		if(str.equals(newStr))
			System.out.println("YES");
		else
			System.out.println("No");
	}

	private static void revArr(char[] n,int start,int end) {
		if( start == end)
			return;
		swap(n,start,end);
		revArr(n, start+1, end-1);
	}

	private static void swap(char[] n, int start, int end) {
		char temp = n[start];
		n[start] = n[end];
		n[end] = temp;
	}
}

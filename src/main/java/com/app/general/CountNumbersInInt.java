package com.app.general;

public class CountNumbersInInt {

	public static void main(String[] args) {
		int pos = strStr("mississippi", "issip");
		System.out.println(pos);
	}

	public static int strStr(String haystack, String needle) {
		int len1 = haystack.length();
		int len2 = needle.length();
		int point = 0;
		for (int i = 0; i < len1; i++) {
			if (haystack.charAt(i) == needle.charAt(point)) {
				if (point == len2 - 1)
					return (i - point);
				point++;
			} else {
				i -= point;
				point = 0;
			}
		}
		return -1;
	}
}

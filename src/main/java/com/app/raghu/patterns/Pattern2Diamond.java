package com.app.raghu.patterns;

/**
 * Diamond Pattern
 * 
 * 1 to < 2n-2i+1 for spaces
 * 1 to <= 2i-1 for stars
 */
public class Pattern2Diamond {

	public static void main(String[] args) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < 2*n - 2*i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2*i -1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < 2*n - 2*i + 1 ; j++) {
				System.out.print(" ");
			}
            for (int j = 1; j <= 2*i -1 ; j++) {
				System.out.print("* ");
			}
            System.out.println();
        }

	}
}

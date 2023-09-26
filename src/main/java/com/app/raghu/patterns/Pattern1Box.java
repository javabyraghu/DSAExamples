package com.app.raghu.patterns;
/**
 * * * *
 * * * *
 * * * *
 */
public class Pattern1Box {

	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				//System.out.print(" "+(j+1)); //1 2 3
				//System.out.print(" "+(i+1)); //1 1 1
				System.out.print("* "); //* * *
			}
			System.out.println();
		}
	}
}

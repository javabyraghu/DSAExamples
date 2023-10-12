package com.app.raghu.patterns;

public class CustomPatterns {
	private static void pattern1(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void pattern2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern3(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void pattern4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	private static void pattern5(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	private static void pattern7(int n) {
		for (int i = 1; i <= n; i++) {
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("-");
			}
			// stars
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			// spaces
			for (int j = 1; j <= n - i; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	private static void pattern8(int n) {
		for (int i = 0; i < n; i++) {
			// spaces
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}
			// stars
			for (int j = 0; j < 2 * (n - i) - 1; j++) {
				System.out.print("*");
			}
			// spaces
			for (int j = 0; j < i; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
	}

	private static void pattern9(int n) {
		pattern7(n);
		pattern8(n);
	}

	private static void pattern10(int n) {
		for (int i = 1; i <= 2 * n - 1; i++) {
			int stars = 0;
			if (i <= n)
				stars = i;
			else
				stars = 2 * n - i;
			for (int j = 0; j < stars; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void pattern11(int n) {
		int num = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				num = 0;
			else
				num = 1;
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num = 1 - num;
			}
			System.out.println();
		}
	}
	private static void pattern12(int n) {
		int spaces = 2*n - 2;
		for (int i = 1; i <= n; i++) {
			//num
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
			}
			//space
			for (int j = 0; j < spaces; j++) {
				System.out.print(" ");
			}
			//num
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			spaces -= 2;
			System.out.println();
		}
	}
	
	private static void pattern13(int n) {
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
	
	private static void pattern14(int n) {
		for (int i = 0; i < n; i++) {
			char c = 'A';
			for (int j = 0; j <= i; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		
	}
	private static void pattern15(int n) {
		for (int i = 0; i < n; i++) {
			char c = 'A';
			for (int j = n-i; j >0; j--) {
				System.out.print(c++);
			}
			System.out.println();
		}
		
	}
	private static void pattern16(int n) {
		char c = 'A';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int n = 5;
		pattern16(n);
	}
}

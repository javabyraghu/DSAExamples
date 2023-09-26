package com.app.raghu.patterns;

import java.util.Stack;

/***
 * String Braces Valid Order Example: {([])}[][{()}]
 * 
 * If Open brace -> add to stack 
 * If close brace -> if stack is empty false 
 * 				  -> if stack top (pop) element is not matching open brace false 
 * If Stack is empty return true
 */

public class Pattern3Braces {

	public static void main(String[] args) {
		String pattern = "{}()[[{()}]]{";
		boolean isValid = validatePattern(pattern);
		System.out.println(isValid);
	}

	private static boolean validatePattern(String pattern) {
		Stack<Character> stack = new Stack<>();
		char[] arr = pattern.toCharArray();
		for (char c : arr) {
			if (c == '[' || c == '{' || c == '(')
				stack.push(c);
			else if (c == ']' || c == '}' || c == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.pop();
				if ((c == ']' && top != '[') 
						|| (c == '}' && top != '{') 
						|| (c == ')' && top != '(')
						)
				{
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}

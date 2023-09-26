package com.app.raghu.crypto;
/***
 * aaabbcccddeff => encrypt => a3b2c3d2ef2
 * a3b2c3d2ef2 => decrypt => aaabbcccddeff
 */
public class StringRepeateCharsEncryptDecrypt {

	
	public static void main(String[] args) {
		String enc = encrypt("aaabbcccdeffcccddeeaaa");
		System.out.println(enc);
		String dec = decrypt(enc);
		System.out.println(dec);
	}

	/** if current char is equal to next char then count++
	 *  else add char and count to StringBuffer. Make currentChar = nextChar, count=1
	 *  At last add the currentChar and count if >1 to SB for last char.
	 */
	private static String encrypt(String input) {
		if(input == null || "".equals(input))
			return "";
		
		StringBuffer sb = new StringBuffer();
		char currentChar = input.charAt(0);
		int count = 1;
		int len = input.length();
		for (int i = 1; i < len; i++) {
			char nextChar = input.charAt(i);
			
			if(currentChar ==  nextChar) {
				count++;
			} else {
				sb.append(currentChar);
				if(count>1) {
					sb.append(count);
				}
				count = 1;
				currentChar = nextChar;
			}
		}
		sb.append(currentChar);
		if(count>1)
			sb.append(count);
		return sb.toString();
	}

	private static String decrypt(String string) {
		return null;
	}
}

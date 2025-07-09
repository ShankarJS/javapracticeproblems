package com.shankarsharmajip.stringproblems;

public class CheckPalindromeString {
	public static void main(String args[]) {
		// 1. Palindrome: mom, dad, cat, race car
		String str = "racecar";
		// System.out.println(isPalindrome(str));

		// 2. reverse a string
		// reverseAString("reverse me");

		// 3. Count characters in given string excluding whitespaces
		// countCharsExcludingWhitespace("Count the chars");
		// countCharsExcludingWhitespace2("Count the chars");
		
		//
	}

	private static void countCharsExcludingWhitespace2(String str) {
		String nospaces = str.replaceAll("\\s+", "");
		int charCount = nospaces.length();
		System.out.println("Number of character in given string excluding whitespaces are: " + charCount);

	}

	private static void countCharsExcludingWhitespace(String str) {
		char[] charArray = str.toCharArray();
		int count = 0;
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] != ' ') {
				count++;
			}
		}
		System.out.println("Number of character in given string excluding whitespaces are: " + count);
	}

	static boolean isPalindrome(String str) {
		if (str.length() == 0 || str == null) {
			return true;
		}
		for (int i = 0; i <= str.length() / 2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length() - 1 - i);
			if (start != end) {
				return false;
			}
		}
		return true;
	}

	static void reverseAString(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length() - 1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
	}
}

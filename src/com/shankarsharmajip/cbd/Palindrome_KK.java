package com.shankarsharmajip.cbd;

public class Palindrome_KK {
	public static void main(String[] args) {
		String str = "abccb";
		System.out.println(isPalindrome4(str));
	}
	
	public static boolean isPalindrome(String str) {
		
		if(str==null || str.length()==0) {
			return true;
		}
		str = str.toLowerCase();
		System.out.println(str);
		for(int i =0; i<=str.length()/2; i++) {
			char start = str.charAt(i);
			char end = str.charAt(str.length()-1-i);
			if(start != end) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome2(String str2) {
		
		if(str2 == null || str2.length()==0) {
			return true;
		}
		str2 = str2.toLowerCase();
		for(int i=0; i<=str2.length()/2; i++) {
			char start = str2.charAt(i);
			char end = str2.charAt(str2.length()-1-i);
			if(start!=end) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isPalindrome3(String str3) {
		if(str3 == null || str3.length()==0) {
			return true;
		}
		
		for(int i =0; i<=str3.length()/2; i++) {
			char start = str3.charAt(0);
			char end = str3.charAt(str3.length()-1-i);
			
			if(start!=end) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome4(String str4) {
		str4= str4.toLowerCase();
		if(str4 == null || str4.length()==0) {
			return true;
		}
		
		for(int i = 0; i<=str4.length()/2; i++) {
			char start = str4.charAt(i);
			char end = str4.charAt(str4.length()-1-i);
			
			if(start != end) {
				return false;
			}
		}
		return true;
	}
	
}

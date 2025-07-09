package com.whiteboard;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "shankar";
		System.out.println(reverseMyString(str));
	}
	
	static StringBuilder reverseMyString(String str){
		char[] charArray = str.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for(int i = charArray.length-1; i >= 0 ; i--) {
			stringBuilder.append(charArray[i]);
		}
		return stringBuilder;
	}
}

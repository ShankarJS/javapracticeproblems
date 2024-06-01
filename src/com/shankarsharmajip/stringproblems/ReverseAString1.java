package com.shankarsharmajip.stringproblems;

public class ReverseAString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Can you please reverse me?";
		
		char[] charArray = input.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		
		for(int i = charArray.length-1; i>= 0; i--) {
			stringBuilder.append(charArray[i]);
		}
		
		System.out.println(stringBuilder);
	}

}

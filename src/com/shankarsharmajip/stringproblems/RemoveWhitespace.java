package com.shankarsharmajip.stringproblems;

//Program to remove whitespace from a string 
public class RemoveWhitespace{ 
	public static void main(String args[]) { 
    	String str = " he llo wo rl d "; 
    	String str1 = str.replaceAll("\\s", "");   //trim() is use to remove trailing whitespaces 
    	System.out.println(str1); 
	} 
} 

package com.practice.stringproblems;
import java.util.*;  
  
public class RemoveDupCharsFromString {  
	public static void main(String args[]) {  
    	String str = "Programming";  
  
    	// approach 1:   Java8   
    	StringBuilder sb1 = new StringBuilder();  
    	str.chars().distinct().forEach(c -> sb1.append((char)c));  
    	System.out.println(sb1);  
  
    	//approach 2: indexOf() method  
    	StringBuilder sb2 = new StringBuilder();  
    	for(int i = 0; i<str.length(); i++){  
        	char ch2 = str.charAt(i);  
        	int index = str.indexOf(ch2, i+1);  
        	if(index==-1){  
            	sb2.append(ch2);  
        	}  
    	}  
    	System.out.println(sb2);  
  
    	//approach 3: toCharArray()  
    	StringBuilder sb3 = new StringBuilder();  
    	char[] arr = str.toCharArray();  
    	for(int i =0; i<arr.length; i++){  
        	boolean repeated = false;  
        	for(int j = i+1; j<arr.length; j++){  
            	if(arr[i]==arr[j]){  
                	repeated=true;  
                	break;  
            	}  
        	}  
        	if(!repeated){  
            	sb3.append(arr[i]);  
        	}  
    	}  
    	System.out.println(sb3);  
  
    	//approach 4:Using LinkedHashset  
    	StringBuilder sb4 = new StringBuilder();  
    	Set<Character> set = new LinkedHashSet();  
    	for(int i=0; i<str.length(); i++){  
        	set.add(str.charAt(i));  
    	}  
    	for(Character c: set){  
        	sb4.append(c);  
    	}  
    	System.out.println(sb4);  
	}  
} 

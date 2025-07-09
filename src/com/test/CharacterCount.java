package com.test;

import java.util.HashMap;
import java.util.Map;

//Zensar
public class CharacterCount {

	public static void main(String[] args) {
	     System.out.println("Try programiz.pro");
	     String str = "My name is Shankarlal Sharma";
	     
	     Map<Character, Integer> map = new HashMap();
	     char[] mychars = str.toCharArray();
	     System.out.println(mychars);
	     int count = 1;
	     int length = str.length();
	     
	     for(int i = 0; i<length; i++){
//	         count = 1; 
	         if(!map.keySet().contains(mychars[i])){
	             map.put(mychars[i], count);
	         } else{
	             map.put(mychars[i], count++);
	         }
//	         count = 1;
	         
	     }
	     System.out.println(map);
	     
	 }

}
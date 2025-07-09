package com.test;

import java.util.HashMap;
import java.util.Map;

//Pinnacle Accelya
public class WordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "India is my country I love my country";
		
//		char[] mychar = str.toCharArray();
		String[] words = str.split(" ");
		
		Map<String, Integer> map = new HashMap();
//		int count = 1;
		
		for(int i =0; i<words.length; i++) {
			
			if(map.containsKey(words[i])) {
				map.put(words[i], map.get(words[i])+1);
			} else {
				map.put(words[i], 1);
			}
		}
		System.out.println(map);
		
		
		
	}

}

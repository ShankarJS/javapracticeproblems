package com.telusko;

import java.util.HashMap;
import java.util.Map;

public class Map94 {

	public static void main(String[] args) {
		Map<String, Integer> emp = new HashMap<>();
		emp.put("Graham", 2);
		emp.put("Harsh", 6);
		emp.put("Rohan", 5);
		emp.put("Aniruddh", 4);
		emp.put("Harsh", 7);
		
		System.out.println(emp);
		System.out.println(emp.keySet());
		System.out.println(emp.get("Harsh"));
		
		for(String key: emp.keySet()) {
			System.out.println(key+" : " + emp.get(key));
		}
	}
}

//Map:
//Key is a set and value is a list
//Key order is not preserved in Hashmap and are unique
//Hashmap is not synchronized, hashtable is synchronized

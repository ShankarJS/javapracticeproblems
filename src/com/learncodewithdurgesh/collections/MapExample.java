package com.learncodewithdurgesh.collections;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		
		HashMap<String, Integer> courses = new HashMap<>();
		courses.put("Core Java", 4000);
		courses.put("Python basics", 3500);
		courses.put("Angular", 5000);
		courses.put("Spring", 6000);
		
		System.out.println(courses);
		
		courses.forEach((key, value)->{
			System.out.print(key);
			System.out.print("=>");
			System.out.println(value);
		});
		
		//Entryset hw
		//Keyset   hw
		
		System.out.println("Spring fees: "+courses.get("Spring"));
		
		
	}
}

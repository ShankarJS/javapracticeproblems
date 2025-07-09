package com.shankarsharmajip.collections;

import java.util.HashMap;
import java.util.Map;

//Q. Create a hashmap and iterate it

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Chemistry");
		map1.put(2, "English");
		map1.put(3, "Maths");
		map1.put(4, "Physics");
		map1.entrySet().stream().forEach(input -> System.out.println(input.getKey() + " : "+input.getValue()));
	}
}

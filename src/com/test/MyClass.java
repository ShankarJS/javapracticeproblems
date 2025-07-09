package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(3, 10, 5, 5, 78, 10);
		
		long count = list.stream().filter(e -> e == 10).count();
		System.out.println(count);
		
		
		int[] arr = {4, 5, 2, 7, 8};
		
		List<int[]> list1 = Arrays.asList(arr);
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		
		for(int i = 0; i<arr.length; i++) {
			int greatest;
			if(arr[i]>arr[i+1]) {
				greatest = arr[i];
				
			}
		}
	}

}

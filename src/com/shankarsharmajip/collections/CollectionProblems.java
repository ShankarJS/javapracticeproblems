package com.shankarsharmajip.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class CollectionProblems {

	public static void main(String[] args) {
		// Write a program to iterate a list, remove duplicates and print count of duplicates 
		identifyDuplicates();
		System.out.println("Hello World 1");
	}

	private static void identifyDuplicates() {
		List<String> items = Arrays.asList("banana", "apple", "mango", "apple", "grapes", "banana");
		
		int originalSize = items.size();
		 
		Set<String> uniqueItems = new LinkedHashSet<>(items);
		
		int uniqueSize = uniqueItems.size();
		int duplicateCount = originalSize - uniqueSize;
		
		System.out.println("Original List: " +items);
		System.out.println("Unique items: " +uniqueItems);
		System.out.println("Number of duplicates removed: "+duplicateCount);
		
	}
}

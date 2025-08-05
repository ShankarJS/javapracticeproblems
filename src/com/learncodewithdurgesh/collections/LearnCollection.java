package com.learncodewithdurgesh.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class LearnCollection {
	public static void main(String[] args) {
		
		/*
		 * List:  ArrayList, LinkedList, Vector
		 * - is indexed
		 * - Can contain duplicate elements
		 * - Insertion order is preserved
		 */
		
		System.out.println("Welcome to java core collection framework");
		ArrayList<String> names = new ArrayList<>();
		names.add("Durgesh");
		names.add("Shankar");
		names.add("Akshay");
		names.add("Akshay");
		System.out.println("names arraylist contains: "+names);
		names.set(1, "Shaurya");
		System.out.println("names arraylist contains: "+names);
		names.remove(1);
		System.out.println("names arraylist contains: "+names);
		
		Vector<String> vector = new Vector<>();
		vector.addAll(names);
		System.out.println("vector contains: "+vector);
		
		System.out.println("-------------------------------------------------------");
		
		/*
		 * Set: HashedSet, TreeSet
		 * - Insertion order is not preserved
		 * - Not indexed
		 * - Duplicates are not allowed
		 */
		
		HashSet<Double> nms = new HashSet<>();
		nms.add(67.65);
		nms.add(89.43);
		nms.add(907.54);
		nms.add(6.786);
		nms.add(83.87);
		nms.add(83.87);
		System.out.println("nms values:" + nms);
		nms.remove(89.43);
		System.out.println("nms values:" + nms);
		
		
		TreeSet<Double> treeSet = new TreeSet<>();
		treeSet.addAll(nms);
		System.out.println("Treeset values: " +treeSet);
		
		
		
	}
}

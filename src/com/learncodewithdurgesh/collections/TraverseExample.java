package com.learncodewithdurgesh.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("Durgesh");
		names.add("Shankar");
		names.add("Akshay");
		names.add("Udit");
		names.add("Himali");
		names.add("Akshay");
		
		for(String str: names) {
			System.out.print(str+"\t"+str.length()+"\t");
			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());
		}
		
		System.out.println("_______________Iterator:________________");
		
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);
		}
		
		System.out.println("______________ListIterator:______________");
		
		//Listiterator has functionality of backward iteration
		ListIterator<String> litr = names.listIterator(names.size());
		
		while(litr.hasPrevious()) {
			String previous = litr.previous();
			System.out.println(previous);
		}
		
		//Enumeration for vector --homework
		
		System.out.println("______________forEach iterator:__________");
		//Iterating the collection using forEach method
		names.forEach(e -> {
			System.out.println(e);
		});
		
		
		System.out.println("______________Iterator on treeset:___________");
		TreeSet<String> treeset = new TreeSet<>();
		treeset.addAll(names);
		treeset.forEach(e->{
			System.out.println(e);
		});
		
		//Comparator  hw
		//Comparable  hw
		

	}

}

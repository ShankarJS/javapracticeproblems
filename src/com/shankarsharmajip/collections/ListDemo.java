package com.shankarsharmajip.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Engineering Digest
//Create, Add, Update, Delete, Retrieve
public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];   //here size need to be mentioned
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(80);
		list.add(20);
		list.add(50);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(int x: list) {
			System.out.println(x);
		}
		
		System.out.println(list.contains(5));
		System.out.println(list.contains(50));
		
//		list.remove(2);
		for(int x: list) {
			System.out.println(x);
		}
		
		list.add(2, 50);		//shifts and inserts
		for(int x: list) {
			System.out.println(x);
		}
		
		list.set(2,  60);		//replaces 
		for(int x: list) {
			System.out.println(x);
		}
		
		
		Collections.sort(list);
		System.out.println(list);
		
		list.sort((a, b) -> Integer.compare(a, b));
		System.out.println(list);
		
		list.sort((a, b) -> Integer.compare(b, a));
		System.out.println(list);
		
		List<String> fruits = Arrays.asList("Apple", "Banana", "Pear");
		fruits.sort(null);  //ascending sort by alphabet
		System.out.println(fruits);
		fruits.sort((a,b)-> a.length()-b.length());		//ascending sort by length
		System.out.println(fruits);
		fruits.sort((a,b)-> b.length()-a.length());   //descending sort by length
		System.out.println(fruits);       
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Alice", 85));
		students.add(new Student("Bob", 92));
		students.add(new Student("Charlie", 75));
		
		students.sort((a,b) -> a.marks - b.marks);		//ascending by marks
		System.out.println(students);
		
		students.sort((a,b) -> b.marks - a.marks);     //descending by marks
		System.out.println(students);
		
	}

}

class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	
	
}

package com.jip.lcwd.polymorphism;

//Overloading or compiletime polymorphism example
public class Student {

	public void read() {
		System.out.println("Reading XYZ book");
		
	}

	public void read(String bookName) {
		// TODO Auto-generated method stub
		System.out.println("Reading "+bookName+" book");
		
	}

}

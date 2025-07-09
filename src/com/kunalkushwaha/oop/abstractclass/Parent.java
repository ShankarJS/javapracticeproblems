package com.kunalkushwaha.oop.abstractclass;

public abstract class Parent {
	
	int age;
	static int sample;
	final int VALUE;
	
	//Below construtor is allowed
//	Parent(){
//		System.out.println("Constructor of an abstract class");
//	}
	
	public Parent(int age) {
		this.age = age;
		VALUE=34234565;
		// TODO Auto-generated constructor stub
	}
	
	//static methods are allowed in abstract class
	static void hello() {
		System.out.println("Hello");
	}
	
	void normal() {
		System.out.println("normal method");
	}
	
	
	
	abstract void career();
	abstract void partner();
}

package com.whiteboard.abstractdemo;

public abstract class MyAbstractParent {
//public final abstract class MyAbstractParent {
	static int staticField = 2;
	final int FINALFIELD;
	int normalField = 6;
	
	void display() {
		System.out.println("I am a default method in abstract class");
	}

	public MyAbstractParent() {
		this.FINALFIELD = 4;
		// TODO Auto-generated constructor stub
	}
	
	abstract void abstractMethod();
	
//	abstract static void abstractStaticMethod();
	
	static void staticMethod() {
		System.out.println("I am static method inside parent abstract class");
	}
	
//	default void defaultMethod() {
//		System.out.println("I am default method inside parent abstract class");
//	}
	
	
}

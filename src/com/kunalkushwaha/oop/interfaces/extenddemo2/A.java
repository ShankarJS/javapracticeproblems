package com.kunalkushwaha.oop.interfaces.extenddemo2;

public interface A {
	
	//static interface methods should always have a body
	//call via the interface name
	static void greeting() {
		System.out.println("Hey I am statiic method");
	}
	
	default void fun() {
		System.out.println("I am in A");
	}
}

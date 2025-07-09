package com.whiteboard.abstractdemo;

public class Main {

	public static void main(String[] args) {
		MyAbstractParent parent1 = new AbstractChild();
		parent1.display();
//		parent1.staticField;
		System.out.println(parent1.staticField);
		System.out.println(MyAbstractParent.staticField);
		System.out.println(parent1.FINALFIELD);
		System.out.println(parent1.normalField);
		parent1.abstractMethod();
		
		AbstractChild child = new AbstractChild();
		child.display();
		System.out.println(child.staticField);
		System.out.println(child.FINALFIELD);
		System.out.println(child.normalField);
		child.abstractMethod();
		AbstractChild.staticMethod();
	}

}

package com.kunalkushwaha.oop.abstractclass;

public class Daughter extends Parent{
	
	Daughter(int age){
		super(age);
	}
	
	@Override
	void career() {
		// TODO Auto-generated method stub
		System.out.println("I am going to be an Artist ");
	}

	@Override
	void partner() {
		// TODO Auto-generated method stub
		System.out.println("I love Iron man");
	}
}

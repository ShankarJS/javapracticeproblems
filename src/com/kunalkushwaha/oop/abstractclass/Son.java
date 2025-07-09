package com.kunalkushwaha.oop.abstractclass;

public class Son extends Parent{
	
	Son(int age){
		super(age);
	}
	
	

	@Override
	void normal() {
		// TODO Auto-generated method stub
		super.normal();
	}



	@Override
	void career() {
		// TODO Auto-generated method stub
		System.out.println("I am going to be a Doctor");
	}

	@Override
	void partner() {
		// TODO Auto-generated method stub
		System.out.println("I Love Pepper Pots");
	}
	
}

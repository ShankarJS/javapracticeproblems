package com.jip.lcwd.polymorphism;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("This is just testing");
//		Student student = new Student();
//		student.read("Think python");
		
		
		//Runtime polymorphism
//		Person person = new Person();
		Person person = new Shyam();
//		person.showDetails();
		
		Ram ram = new Ram();
		ram.doWork(person);
		
		
		
	}

}

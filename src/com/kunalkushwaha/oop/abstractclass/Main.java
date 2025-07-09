package com.kunalkushwaha.oop.abstractclass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son = new Son(24);
		son.career();
		son.normal();
		
		Daughter daughter = new Daughter(22);
		daughter.career();
		
		//You cannot initialize an abstract class and if you try you will have to implement the methods also at the same time
//		Parent mom = new Parent(45);  
		
		Parent.hello();
		
		//This is allowed
		Parent daughter1 = new Daughter(24);
	}

}

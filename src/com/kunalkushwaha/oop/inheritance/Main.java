package com.kunalkushwaha.oop.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box box = new Box();
//		Box box = new Box(6);
//		Box box = new Box(3.9, 9.7, 7.0);
//		Box box1 = new Box(box);
//		
//		System.out.println(box.l + " " + box.h + " "+box.w);
//		System.out.println(box1.l + " " + box1.h + " "+box1.w);
		
//		BoxWeight box3 = new BoxWeight();
//		BoxWeight box4 = new BoxWeight(4, 7, 8, 9);
//		System.out.println(box3.h+" " +box3.weight);
		
		//Parent class cannot see/access the properties of child, eg. below:
		Box box5 = new BoxWeight(2, 3, 4, 8);
//		System.out.println(box5.weight);		//not possible as parent cannot access child props
		//It is the type of reference variable and not the object type that determines what members can be accessed
		System.out.println(box5.h);  //this is possible
		
		//--------------------
		
		//Below line will geve error, because even though ref type is BoxWeight and we will be able to access weight variable from
		//BoxWeight class, but how we will initialize it? as Box() constructor ie parent class constructor wont be able to initialize weight
//		BoxWeight box6 = new Box(2, 3, 4, 8);
//		System.out.println(box6);
		
		
	}

}

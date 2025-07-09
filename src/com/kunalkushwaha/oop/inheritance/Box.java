package com.kunalkushwaha.oop.inheritance;

public class Box {
//	private double l;  //In subclass it will not be accessible
	double l;
	double h;
	double w;
	
	Box(){
		l=-1;
		h=-1;
		w=-1;
	}
	
	Box(double side){
		l=side;
		h=side;
		w=side;
	}
	
	Box(double l, double h, double w){
		this.l = l;
		this.h = h;
		this.w = w;
	}
	
	Box(Box other){
		this.l = other.l;
		this.h = other.h;
		this.w = other.w;
	}
	
	public void information() {
		System.out.println("Running the box");
	}
}

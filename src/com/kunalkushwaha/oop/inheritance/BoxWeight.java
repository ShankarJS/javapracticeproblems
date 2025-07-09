package com.kunalkushwaha.oop.inheritance;

public class BoxWeight extends Box{
	double weight;

	public BoxWeight() {
		weight = -1;
//		h=0;
	}

	public BoxWeight(double l, double h, double w, double weight) {
		super(l, h, w);
		// TODO Auto-generated constructor stub
		this.weight=weight;
	}


	
	
}

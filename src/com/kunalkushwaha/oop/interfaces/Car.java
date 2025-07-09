package com.kunalkushwaha.oop.interfaces;

public class Car implements Engine, Brake, Media {

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("I brake like a normal car");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I start engine like a normal car");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I stop engine like a normal car");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("I accelerate like a normal car");
	}
	
}

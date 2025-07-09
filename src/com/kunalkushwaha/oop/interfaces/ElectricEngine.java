package com.kunalkushwaha.oop.interfaces;

public class ElectricEngine implements Engine {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine stop");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine accelerates");
	}

}

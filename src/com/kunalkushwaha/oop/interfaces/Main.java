package com.kunalkushwaha.oop.interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.acc();
		car.start();
		car.stop();
		
		Engine engine = new Car();
		engine.stop();
		
		Media carMedia = new Car();
		carMedia.stop();
		
		System.out.println("-----------------");
		
		NiceCar niceCar = new NiceCar();
		niceCar.start();
		niceCar.startMusic();
		niceCar.upgradeEngine();
		niceCar.start();
	
	}

}

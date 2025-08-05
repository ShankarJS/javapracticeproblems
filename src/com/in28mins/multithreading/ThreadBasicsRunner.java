package com.in28mins.multithreading;

class Task1 extends Thread{
	public void run() {		//SIGNATURE
		System.out.print("\nTask 1 started");
		for(int i = 101; i<=199; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 1 done");
	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		System.out.print("\nTask 2 started");
		for(int i = 201; i<=299; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 2 done");
	}
	
}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		
		//New
		//Runnable
		//Running
		//Blocked/Waiting
		//Terminated/Dead
		
		//Task 1
		System.out.print("\nTask 1 kicked off");
		Task1 task1 = new Task1();
		task1.setPriority(1);
		//task1.run();  //this will run the task as typical program not as a thread
		task1.start();
		
		//task 2
		System.out.print("\nTask 2 kicked off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();
		
		//Wait for task1 to complete
		task1.join();
		task2Thread.join();
		
		//Task 3
		System.out.print("\nTask 3 kicked off");
		for(int i=301; i<=399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 3 done");
		System.out.print("\nMain done");
	}

}

package com.in28mins.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	
	private int number;

	public Task(int number) {		//This will enable us to kickoff a lot of threads immediately
		this.number = number;
	}
	
	public void run() {		//SIGNATURE
		System.out.print("\nTask" +number+ " started");
		for(int i = number*100; i<=number*100+99; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask" +number+ " done");
	}
}

//using newFixedThreadPool
public class ExecutorServiceRunner_fixedpool {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		executorService.execute(new Task(1));
		executorService.execute(new Task(2));
		executorService.execute(new Task(3));
		executorService.execute(new Task(4));
		executorService.execute(new Task(5));
		executorService.execute(new Task(6));
		executorService.execute(new Task(7));
		
		executorService.shutdown();

	}

}

package com.in28mins.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Using newSingleThreadExecutor
public class ExecutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Task(1));
		executorService.execute(new Thread(new Task2()));

		// Task 3
		System.out.print("\nTask 3 kicked off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.print("\nTask 3 done");
		System.out.print("\nMain done");
		
		executorService.shutdown();

	}

}

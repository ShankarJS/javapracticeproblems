package com.jenkov.java.concurrency.thread;

public class ThreadExample {
	
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();
		//It will run parallel to main thread and will start and stop immediately
		System.out.println("Hello from thread: "+Thread.currentThread().getName());
	}
}

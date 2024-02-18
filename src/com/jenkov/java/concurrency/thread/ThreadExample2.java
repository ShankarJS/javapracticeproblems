package com.jenkov.java.concurrency.thread;

public class ThreadExample2 {
	public static class MyThread extends Thread{
		public void run() {
			System.out.println("MyThread running");
			System.out.println("MyThread finished");
		}
	}
	
	public static void main(String[] args) {
		Thread thread = new Thread();
		thread.start();  
		
		
		MyThread myThread = new MyThread();
		myThread.start();
	}
}

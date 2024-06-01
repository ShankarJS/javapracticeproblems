package com.defog.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for sccheduling of tasks
		ScheduledExecutorService service = Executors.newScheduledThreadPool(10);
		
		//task to run after 10 second delay
//		service.schedule(new Task(), 10, TimeUnit.SECONDS);
		
		//task to run repeatedly every 10 seconds
//		service.scheduleAtFixedRate(new Task(), 15, 10, TimeUnit.SECONDS);
		
		//task to run repeatedly 10 seconds after previous task completes
		service.scheduleWithFixedDelay(new Task(), 15, 10, TimeUnit.SECONDS);
		
	}

}

class Task implements Runnable{
	public void run() {
		//task that need to be run based on schedule
		for(int i=0; i<=10; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
}

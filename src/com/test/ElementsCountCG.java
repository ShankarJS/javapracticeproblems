package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ElementsCountCG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stationary = Arrays.asList("Pen", "Pencil", "Rubber", "Pen", "Pencil");
		
		// Use streams to count the frequency of each item
        Map<String, Long> frequencyMap = stationary.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        // Print the frequency of each item
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
		
		List<Integer> numbers = Arrays.asList(1, 5, 7, 8, 9, 2);
		List<Integer> even = numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println("even: "+even);
		
		Even e1 = new Even();
		e1.start();
		
		Odd o1 = new Odd();
		o1.start();
	}

}

class Even extends Thread{
	public void run() {
		for(int i =0; i<=20; i++) {
			if(i%2==0) {
				System.out.println("even: "+i);
			}
		}
	}
}

class Odd extends Thread{
	public void run() {
		for(int i =0; i<=20; i++) {
			if(i%2!=0) {
				System.out.println("odd: "+i);
			}
		}
	}
}

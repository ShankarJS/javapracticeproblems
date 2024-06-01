package com.learncodewithdurgesh.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMethods {

	public static void main(String[] args) {
		
		//Imp operations on stream: Intermediate and terminal
		//Demo of intermediate ops:
		//1. filter  //it accepts predicate
		List<String> skillset = Arrays.asList("Core Java", "spring framework", "Spring mvc", "Angular 13", "Microservices");
		List<String> filteredSkillset = skillset.stream().filter(e -> e.contains("v")).collect(Collectors.toList());
		System.out.println("filteredSkillset: "+filteredSkillset);
		
		//2. sorted
		List<Integer> numsList = Arrays.asList(6, 1, 20, 42, 7, 6);
		List<Integer> sortedNumsList = numsList.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedNumsList: "+sortedNumsList);
		
		//3. map	//it takes a function
		List<Integer> squaredNumsList = sortedNumsList.stream().map(e -> e*e).collect(Collectors.toList());
		System.out.println("squaredNumsList: "+squaredNumsList);
		
		//Stream terminal operations:
		//1. collect:
		List<Integer> sortedNumsList1 = numsList.stream().sorted().collect(Collectors.toList());
		System.out.println("sortedNumsList: "+sortedNumsList);
		
		//2. foreach:
		System.out.println("even no.: ");
		numsList.stream().filter(e -> e%2==0).forEach(System.out::println);
		
		//3. reduce:   //takes initial value and carry and element  //refer telusko video
		Integer sumOfTwicedNums = numsList.stream().map(e -> e*2).reduce(0, (c,e)->c+e);
		System.out.println("reduced with addition of twiced numbers: " +sumOfTwicedNums);
		
	}
}

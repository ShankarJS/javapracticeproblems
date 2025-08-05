package com.shankarsharmajip.collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// How would you count the number of even numbers in a list using streams?
			List<Integer> intList = Arrays.asList(9, 2, 3, 5, 4, 3, 7, 2, 6, 8, 8);
//		List<Integer> intList = Arrays.asList(3, 2, 4, 2);
		long evenCount = intList.stream().filter(x->x%2==0).count();
		System.out.println("Count of evens: "+evenCount);
		List<Integer> evenList = intList.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("Even list: "+evenList);
		
		//Given a list of strings, how do you get a list of strings in uppercase using streams?
		List<String> stringList = Arrays.asList("Apple", "Mango", "Banana", "Mango", "Apple");
		List<String> upperCaseStrings = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Strings in uppercase: "+upperCaseStrings);
		
		//How do you remove duplicates from a stream?
		List<String> distinctList = stringList.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct list: " +distinctList);
		
		//Given a list with duplicate integers, return a list with unique values.
		List<Integer> distInts = intList.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct ints: "+distInts);
		
		//Explain how reduce() works. Can you write code that sums a list of integers using reduce()?
		//		Integer sum = intList.stream().reduce(0, (x,y)->x+y);
		Integer sumRef = intList.stream().reduce(0, Integer::sum);
		System.out.println("Sum: "+sumRef);
		
		//Count how many strings in a list start with the letter 'A'.
		long aCount = stringList.stream().filter(x->x.startsWith("A")).count();
		System.out.println("Strings that start with A: "+aCount);
		
		//Sort a list of integers in descending order using streams.
		List<Integer> sortedInts = intList.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted list: "+sortedInts);
		
		//Given a list of integers, calculate the sum of their squares using streams.
		Integer sumOfSquares = intList.stream().map(x -> x*x).reduce(0, Integer::sum);
		System.out.println("Sum of squares: " +sumOfSquares);
		
		// From a string, find the first non-repeated character using Stream API.
		String word = "MissiMIIssippil";
		Optional<Character> firstNonRepeatChar = word.chars().mapToObj(x->(char) x)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(entry -> entry.getValue()==1).map(Map.Entry::getKey).findFirst();
		System.out.println("First non repeating char: "+firstNonRepeatChar);
		
		// Group a list of Employee objects by department.
		Employee emp1 = new Employee("Rahul", "Sales", 50000);
		Employee emp2 = new Employee("Ajay", "Sales", 60000);
		Employee emp3 = new Employee("Varun", "Product", 30000);
		Employee emp4 = new Employee("Atul", "Product", 90000);
		Employee emp5 = new Employee("Sonu", "IT", 80000);
		Employee emp6 = new Employee("Shreya", "IT", 90000);
		List<Employee> empList = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6);
		Map<String, List<Employee>> empsByDept = empList.stream().collect(Collectors.groupingBy(emp -> emp.department));
		System.out.println(empsByDept);
		System.out.println();
		
		Map<String, Optional<Employee>> maxByDept = empList.stream().
				collect(Collectors.groupingBy(emp->emp.department,Collectors.maxBy(Comparator.comparingDouble(emp-> emp.salary))) );
		maxByDept.forEach((dept, empOpt) -> System.out.println(dept+"->"+empOpt.orElse(null)));
		
		//Given a list of strings, join them into a single comma-separated string.
		String joinedStrings = stringList.stream().collect(Collectors.joining(","));
		System.out.println("Joined strings: "+joinedStrings);
		
		//Given a list of integers, find the elements that appear more than once using streams.
		List<Integer> intCounts = intList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
								.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("Integers that are repeated: "+intCounts);
		
		
		//How will you sort asc and desc a list of students by firstname
		//How will you sort asc and desc a list of emp by name
		List<Employee> sortedAsc = empList.stream().sorted(Comparator.comparing(emp->emp.name)).collect(Collectors.toList());
		sortedAsc.forEach(System.out::println);
		System.out.println();
		List<Employee> sortedDesc = empList.stream()
			    .sorted(Comparator.comparing((Employee emp) -> emp.name).reversed())
			    .collect(Collectors.toList());
		sortedDesc.forEach(System.out::println);
		
		
		
	}

}

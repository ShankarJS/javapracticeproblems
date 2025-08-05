package com.shankarsharmajip.collections;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Filter even numbers from a list of integers.

Convert a list of strings to uppercase.

Find the first element in a list that starts with 'A'.

Remove duplicate elements from a list.

Sort a list of integers in reverse order.

Count the number of strings with length > 5.

Convert a list of strings to a list of their lengths.

Check if any element in the list matches a condition (e.g., string contains "Java").

Join a list of strings with commas.

Create a list of squares from a list of integers.
-----------
Given a list of strings, return the string with the maximum length.

Group a list of employees by department.

Find the sum of all even numbers in a list.

Given a list of people, partition them into adults (age >= 18) and minors.

Count occurrences of each character in a string.

Flatten a list of lists of integers into a single list.

Find the second highest number in a list using streams.

Find duplicate elements in a list.

Given a list of employees, find the average salary.

Check if all elements in a list satisfy a condition (e.g., > 0).
--------------------
1. *Separate odd and even numbers from a list using streams.*
2. *Remove duplicate elements from a list using streams.*
3. *Find the maximum value in a list using streams.*
4. *Find the minimum value in a list using streams.*
5. *Calculate the sum of all elements in a list using streams.*
6. *Find the average of a list of integers using streams.*
7. *Get the first non-repeated character from a String using streams.*
8. *Find the first repeated character in a String using streams.*
9. *Sort all values present in a list using streams.*
10. *Reverse sort a list of integers using streams.*
11. *Count the occurrences of each character in a string using streams.*
12. *Group list elements by some property (e.g., even/odd, word length) using streams.*
13. *Group custom objects (e.g., Employee by department) using streams.*
14. *Partition a list into two groups based on a predicate (e.g., passing/failing scores).*
15. *Merge two lists into a single list using streams.*
16. *Find the intersection of two lists using streams.*
17. *Find the union of two lists using streams.*
18. *Find the difference between two lists using streams.*
19. *Remove all null values from a list using streams.*
20. *Find the longest string in a list using streams.*
21. *Find the shortest string in a list using streams.*
22. *Sort a list of custom objects by a property using streams (e.g., age, name).*
23. *Find all palindromic strings in a list using streams.*
24. *Sum integers greater than a given threshold using streams.*
25. *Find duplicate elements and their count in a list using streams.*
26. *Create a map from a list of objects using streams (e.g., id to name).*
27. *Get all distinct elements from a list using streams.*
28. *Find the second highest number in a list using streams.*
29. *Convert a list of strings to uppercase using streams.*
30. *Flatten a list of lists (List<List<T>>) into a single list using streams (flatMap).*
31. *Count the total number of elements in a list using streams.*
32. *Limit and skip elements in a stream (pagination).*
33. *Check if any element matches a condition using streams.*
34. *Check if all elements match a condition using streams.*
35. *Check if no elements match a condition using streams.*
36. *Convert a stream to an array using streams.*
37. *Find the frequency of each word in a list using streams.*
38. *Sort a list of objects by multiple properties using streams (thenComparing).*
39. *Convert a list of integers to a comma-separated string using streams.*
40. *Convert an array to a stream and perform operations.*
41. *Map one property from a list of objects to another list (e.g., employee age).*
42. *Remove elements based on a predicate from a list using streams.*
43. *Reverse a list using streams.*
44. *Split a string into words and count unique words using streams.*
45. *Group objects by property and count each group using streams.*
46. *Find employees who joined after a given year using streams (with custom object).*
47. *List all unique cities from list of Employees using streams.*
48. *Perform case-insensitive filtering of strings with streams.*
49. *Find the department with a maximum number of employees using streams.*
50. *Implement custom Collector to join strings with a delimiter.*
*/
public class StreamDemo1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ball", "Cat", "Dog", "Apple", "Lion", "Ant", "Lion", "Cat", "Pomegranate");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        List<List<String>> list1 = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));
//        filterEvenNumbers();
//        stringsToUppercase();
//        firstElementWithA(list);
//        removeDuplicates(list);
//        sortInDesc(intList);
//            stringsToLengths(list);
//            stringWithCommas(list);
        //----------------
//        maxLength(list);
//        List<Employee> employees = Arrays.asList(
//                new Employee("Alice", "HR", 50000),
//                new Employee("Bob", "Engineering", 75000),
//                new Employee("Charlie", "Engineering", 80000),
//                new Employee("Diana", "HR", 52000),
//                new Employee("Ethan", "Finance", 65000),
//                new Employee("Fiona", "Engineering", 72000),
//                new Employee("George", "Marketing", 55000),
//                new Employee("Hannah", "Finance", 68000),
//                new Employee("Ian", "Sales", 60000),
//                new Employee("Julia", "Sales", 62000)
//        );
//        empByDept(employees);

//        sumOfEvenNumbers(intList);
//        charOccurence();
//        flattening(list1);

        secondHighest(intList);
    }

    private static void secondHighest(List<Integer> intList) {
        intList.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }

    private static void flattening(List<List<String>> list1) {
        System.out.println(list1);
        List<String> collect = list1.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(collect);

    }

    private static void charOccurence() {
        String str = "aabbbcccclllsss";
        Map<Character, Long> collect = str.chars().mapToObj(x -> (char) x).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }


    private static void sumOfEvenNumbers(List<Integer> intList) {
        long sum = intList.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).summaryStatistics().getSum();
        System.out.println(sum);

    }

    private static void empByDept(List<Employee> employees) {
        Map<String, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(x -> x.department));
        System.out.println(collect);

    }

    private static void maxLength(List<String> list) {
        list.stream().max((x,y) -> x.length()-y.length()).ifPresent(System.out::println);
        list.stream().max(String::compareTo).ifPresent(System.out::println);

    }

    private static void stringWithCommas(List<String> list) {
        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);

    }

    private static void stringsToLengths(List<String> list) {
        List<Integer> collect = list.stream().map(x -> x.length()).collect(Collectors.toList());
        System.out.println(collect);

    }

    private static void sortInDesc(List<Integer> intList) {
        List<Integer> collect = intList.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect);

    }

    private static void removeDuplicates(List<String> list) {
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

    }

    private static void firstElementWithA(List<String> list) {

        list.stream().filter(x->x.startsWith("A")).findFirst().ifPresent(x-> System.out.println(x));

    }


    private static void filterEvenNumbers() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);


    }
}

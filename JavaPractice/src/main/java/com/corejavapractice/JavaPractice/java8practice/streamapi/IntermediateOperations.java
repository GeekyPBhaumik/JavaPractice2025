package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOperations {
    public static void main(String[] args) {
        //Given a list of numbers [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
        // filter out only the even numbers and print them.
        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        listNumbers.stream().filter(x->x%2==0).forEach(System.out::println);

        //Given a list of names ["alice", "bob", "charlie", "anna"], convert all names to uppercase.
        List<String> listNames = List.of("Alice", "bob", "charlie", "Anna");
        listNames.stream().map(String::toUpperCase).forEach(System.out::println);

        //Given a list of numbers [5, 3, 8, 1, 9, 2], sort them in ascending order and print.
        List<Integer> listUnsortedNums = Arrays.asList(5, 3, 8, 1, 9, 2);
        listUnsortedNums.stream().sorted().forEach(System.out::println);
        listUnsortedNums.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);//descending order

        //Given a list of numbers [1, 2, 2, 3, 4, 4, 5], remove duplicates and print.
        List<Integer> listDuplicateNums = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        listDuplicateNums.stream().distinct().forEach(x-> System.out.print(x+" "));
        System.out.println();

        //Given a list of numbers [10, 20, 30, 40, 50], print only the first 3 elements using limit().
        List<Integer> listNums = Arrays.asList(10, 20, 30, 40, 50);
        listNums = listNums.stream().limit(3).collect(Collectors.toList());
        System.out.println(listNums);

        //Given a list of names, filter names that start with the letter "A" and print them.
        listNames.stream().filter(str->str.startsWith("A")).forEach(System.out::println);
    }
}

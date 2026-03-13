package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombinedProblems {
    public static void main(String[] args) {
        //Given a list of numbers [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], filter even numbers, multiply each by 2,
        // and collect into a new List.
        List<Integer> listNums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = listNums.stream()
                                       .filter(x->x%2==0)
                                       .map(x->x*2)
                                       .collect(Collectors.toList());
        System.out.println(result);

        //Given a list of names ["Alice", "Bob", "Charlie", "Anna", "Brian"],
        // filter names starting with "A", convert to uppercase, and print each one.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "Brian");
        names.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase).
                forEach(x->System.out.print(x+" "));
    }
}

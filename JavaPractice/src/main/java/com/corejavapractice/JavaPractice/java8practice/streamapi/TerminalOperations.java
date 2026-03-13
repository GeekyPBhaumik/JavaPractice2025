package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TerminalOperations {
    public static void main(String[] args) {
        //Given a list of numbers [1, 2, 3, 4, 5], find the sum using reduce().
        List<Integer> listNumbers = List.of(1, 2, 3, 4, 5);
        int sum = listNumbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(sum);

        //Given a list of names, collect only names longer than 3 characters into a new List.
        List<String> listNames = Arrays.asList("Ravi","Rohan","Avi","Rou","Dilip");
        listNames.stream().filter(name->name.length()>3)
                          .forEach(System.out::println);

        //Given a list of numbers, find the maximum value using max().
        List<Integer> listIntegers = Arrays.asList(3,22,12,6,70,56);
        int max = listIntegers.stream().sorted(Comparator.reverseOrder()).findFirst().orElse(0);
        System.out.println(max);

        //Approach 2 - efficient using max()
        //You're telling max() — "use the natural ascending order to compare elements, and give me the largest one from that ordering."
        int maxNum = listIntegers.stream().max(Comparator.naturalOrder()).orElse(0);
        System.out.println(maxNum);

        //Given a list of numbers [1, 2, 3, 4, 5], count how many numbers are greater than 3.
        long count = listNumbers.stream().filter(num->num>3).count();
        System.out.println("Count of Numbers Greater Than 3:"+count);
    }
}

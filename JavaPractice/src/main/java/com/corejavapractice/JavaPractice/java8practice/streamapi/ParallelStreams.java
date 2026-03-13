package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.util.Arrays;
import java.util.List;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> listNums = Arrays.asList(1,2,3,4,5,6,7);
        listNums.stream().forEach(System.out::println);
        //parallel streams
        System.out.println("-------------- Using Parallel Streams -------------");
        listNums.parallelStream().forEach(System.out::println);
        listNums.stream().parallel().forEach(System.out::println);
    }
}

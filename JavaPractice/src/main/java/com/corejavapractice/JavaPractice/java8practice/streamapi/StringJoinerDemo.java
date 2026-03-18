package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerDemo {
    public static void main(String[] args) {
        StringJoiner strJoiner = new StringJoiner(",","[","]");
        strJoiner.add("Apple");
        strJoiner.add("Orange");
        strJoiner.add("Banana");
        System.out.println(strJoiner);
        List<String> fruits = Arrays.asList("Apple","Banana","Orange");
        String fruitsStr = fruits.stream().collect(Collectors.joining(", ","[","]"));
        System.out.println(fruitsStr);
    }
}

package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.util.Arrays;

public class FlatMapDemo {
    public static void main(String[] args) {
        String[] sentence = {"Hello World","Good Morning","Let's Go For Walk"};
        Arrays.stream(sentence).map(x->x.split(" ")).forEach(System.out::println);
        //here split returns String[] so map won't work here as mapm will return Stream<String[]>
        Arrays.stream(sentence).flatMap(x->Arrays.stream(x.split(" ")))
                               .forEach(System.out::println);

        //So map is getting a String[] here so at line 8 we have first converted sentence array
        //into a stream and then the stream returns Stream<String[]> because split returns String[]
        //and when we traverse through each element of the stream, it returns us the String references

        //Similarly, inside flatMap what it can do is if you give it Stream<Stream<String>> instead of
        //Stream<String[]> it will combine all streams into one stream and return us the desired result.
        //So here, for converting that inside instead of using x->x.split(" "), we are using
        //x->Arrays.stream(x.split(" "))
        //Inside the flatMap-> we are converting String[] -> Stream<String>
        //[By using Arrays.stream() - as it converts each element in an array into a Stream]
    }
}

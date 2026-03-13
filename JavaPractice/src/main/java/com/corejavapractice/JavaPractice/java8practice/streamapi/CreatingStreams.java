package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreams {
    public static void main(String[] args) throws IOException {
        //From a collection
        List<String> listFruits = Arrays.asList("Guava","Apple","Orange","Mango");
        String firstFruit = listFruits.stream().findFirst().orElse("Not Found");
        System.out.println(firstFruit);

        //From Arrays
        int[] arr = {6,7,33,23,9,20};
        Arrays.stream(arr).sorted().forEach(System.out::println);

        //From Streams directly
        Stream<Integer> streamInt = Stream.of(2,45,32,11,67,88);
        streamInt.forEach(System.out::println);

        //Primitive Streams
        IntStream intStream = IntStream.range(0,6);//excluding the 6
        intStream.forEach(System.out::println);
        IntStream intRangeStream = IntStream.rangeClosed(0,6);//end inclusive
        intRangeStream.forEach(x-> System.out.print(x+", "));
        System.out.println();

        // Reading lines from a file as a Stream
        try (Stream<String> lines = Files.lines(Path.of("G:\\Java 8 Stream API\\file.txt"))) {
            lines.forEach(System.out::println);
        }
    }
}

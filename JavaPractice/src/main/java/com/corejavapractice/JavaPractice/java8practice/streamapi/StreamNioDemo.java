package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class StreamNioDemo {
    public static void main(String[] args) throws IOException {
        //try-with-resources
        System.out.println(" ============= Using Lines method ============= ");
        try(Stream<String> lines = Files.lines(Path.of("G:\\Java 8 Stream API\\file\\filecontent.txt"))) {
            lines.forEach(System.out::println);
        }
        //Printing everything inside the folder mentioned
        System.out.println(" ============= Using List Method ============= ");
        Stream<Path> paths = Files.list(Path.of("G:\\Java 8 Stream API\\file"));
        paths.forEach(System.out::println);
        //Printing everything inside the folder and it's subdirectories
        System.out.println(" ============= Using Walk Method ============= ");
        Stream<Path> folderPaths = Files.walk(Path.of("G:\\Java 8 Stream API\\file"));
        folderPaths.forEach(System.out::println);
    }
}

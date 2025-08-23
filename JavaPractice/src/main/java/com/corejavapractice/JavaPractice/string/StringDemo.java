package com.corejavapractice.JavaPractice.string;

/*
A String in Java is fundamentally an immutable object that represents a sequence of characters.
Now there are two major memory locations one is Heap Memory and One is  String Constant Pool
which is a special memory inside the Heap itself.
Heap Memory area is a storage location in memory where all the objects are stored,
and it is accessible by the entire application.
Its memory is allocated at the starting of the program by JVM itself.
It's allocated memory dynamically and deallocated by the garbage collector itself.
When we create a String using the new keyword it is stored in the Heap Memory
and everytime it refers to a new location.
String Memory Pool is a special area inside the Heap Memory itself
which is present for the JVM to boost optimization.
When we create a String literal,
JVM first checks if there is any String with the same value,
if it's present it returns the same memory location,
if it's not present, it will create a new String literal in the memory location
*/

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("Testing for literals");
        String s1 = "Hello Bot";
        String s2 = "Hello Bot";
        System.out.println(s1==s2);
        String s3 = s1;
        System.out.println(s3==s2);
        String s4 = s3 + ", How are you";
        System.out.println(s4 == s3);
        System.out.println("Testing with new keywords");
        String s5 = new String("GoodNight!");
        String s6 = new String("GoodNight!");
        System.out.println(s5 == s6);
        String s7 = s5;
        System.out.println("Comparisons before Modifications");
        System.out.println(s7 == s5);
        System.out.println("Comparisons after Modifications");
        s7 = s5.toLowerCase();
        System.out.println(s7 == s5.toLowerCase());
    }
}

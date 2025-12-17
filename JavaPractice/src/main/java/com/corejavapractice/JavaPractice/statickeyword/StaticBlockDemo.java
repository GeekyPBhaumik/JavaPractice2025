package com.corejavapractice.JavaPractice.statickeyword;

public class StaticBlockDemo {
    static int counter;
    static{
        counter = 10;
        counter++;
        System.out.println("Static block executed. Counter initialized to " + counter);
    }

    public static void main(String[] args) {
        System.out.println("Inside main method. Counter value: " + counter);
    }
}

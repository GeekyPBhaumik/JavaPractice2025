package com.corejavapractice.JavaPractice.statickeyword;

public class StaticMethodDemo {
    static int counter = 1;
    int instanceCounter = 1;
    static int addUtility(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Counter: " + counter);
        System.out.println("Add Utility: " + addUtility(5, 10));
    }
}

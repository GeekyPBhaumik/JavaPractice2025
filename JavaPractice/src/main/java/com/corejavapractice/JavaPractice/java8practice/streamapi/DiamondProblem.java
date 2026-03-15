package com.corejavapractice.JavaPractice.java8practice.streamapi;

interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B {
    default void show() {
        System.out.println("B's show");
    }
}

public class DiamondProblem implements A, B{
    public static void main(String[] args) {
        DiamondProblem obj = new DiamondProblem();
        obj.show();
    }
    @Override
    public void show() {
        A.super.show();
        // OR
        B.super.show(); // explicitly call B's version
        // OR write your own implementation
    }
}
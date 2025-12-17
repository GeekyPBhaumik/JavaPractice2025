package com.corejavapractice.JavaPractice.statickeyword;

public class StaticNestedDemo {
    static class InnerStaticNestedClass {
        void display() {
            System.out.println("Inside Static Nested Class");
        }
    }

    public static void main(String[] args) {
        StaticNestedDemo.InnerStaticNestedClass innerClassObj =
                new StaticNestedDemo.InnerStaticNestedClass();
        innerClassObj.display();
    }
}
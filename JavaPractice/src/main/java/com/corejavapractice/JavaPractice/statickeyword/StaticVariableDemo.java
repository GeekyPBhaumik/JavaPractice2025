package com.corejavapractice.JavaPractice.statickeyword;

public class StaticVariableDemo {
    static int count;
    static{
        count = 1;
    }

    public static void main(String[] args) {
        System.out.println(StaticVariableDemo.count);
    }
}

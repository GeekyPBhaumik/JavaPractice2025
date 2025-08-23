package com.corejavapractice.JavaPractice.string;

public class MutableStringDemo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        System.out.println(str.hashCode());
        str = str.append(", World");
        System.out.println(str.hashCode());
        StringBuffer str1 = new StringBuffer(str);
        System.out.println(str1);

        StringBuilder strBuilder = new StringBuilder("GoodNight!");
        System.out.println(strBuilder);
    }
}

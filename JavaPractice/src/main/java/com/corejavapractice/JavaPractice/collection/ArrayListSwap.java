package com.corejavapractice.JavaPractice.collection;

//Write a method to swap the first and the last element of any given ArrayList

import java.util.ArrayList;

public class ArrayListSwap {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Alice");
        arrList.add("John");
        arrList.add("Steve");
        String firstElement = arrList.get(0);
        String lastElement = arrList.get(arrList.size()-1);
        arrList.set(0,lastElement);
        arrList.set(arrList.size()-1,firstElement);
        System.out.println(arrList);
    }
}

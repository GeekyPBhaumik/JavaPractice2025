package com.corejavapractice.JavaPractice.collection.iterators;
//Goal: Write a method that takes a List<Integer> and removes all numbers that are divisible by 3,
//but you must use an Iterator.

//Input: [1, 3, 4, 6, 7, 9, 10]
//Expected Output: [1, 4, 7, 10]

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class SafeSelectiveRemove {
    public static void main(String[] args) {
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(3);
        listInt.add(4);
        listInt.add(6);
        listInt.add(7);
        listInt.add(9);
        listInt.add(10);
        ListIterator<Integer> listItr = listInt.listIterator();
        while(listItr.hasNext()){
            int num = listItr.next();
            if(num%3==0){
                listItr.remove();
            }
        }
        System.out.println(listInt);
    }
}

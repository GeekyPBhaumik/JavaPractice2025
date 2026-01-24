package com.corejavapractice.JavaPractice.collection;

//The "Header & Footer"
//Scenario: Given a LinkedList of strings, add the string "START" to the beginning and "END" to the very end.
//Then, check if the first element is actually "START".

import java.util.LinkedList;

public class LinkedListStartEnd {
    public static void main(String[] args) {
        LinkedList<String> listStr = new LinkedList<>();
        listStr.addFirst("START");
        listStr.addLast("END");
        if(!listStr.isEmpty() && listStr.getFirst().equals("START")){
            System.out.println("Yes, the first element is START");
        }else{
            System.out.println("No, the first element is NOT START");
        }
    }
}

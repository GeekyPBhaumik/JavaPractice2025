package com.corejavapractice.JavaPractice.collection.hashmap;
//Goal: Understand how put() behaves with new vs. existing keys.
//Create a HashMap<Integer, String>.
//Add (101, "John"), (102, "Alice"), and (101, "Robert").
//Question: What is the size of the map? When you call get(101), do you get "John" or "Robert"?
//Next Step: Use the putIfAbsent(101, "Mike") method. Does it change the map?

import java.util.HashMap;

public class BasicDuplicates {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(101,"John");
        hashMap.put(102,"Alice");
        System.out.println(hashMap);
        hashMap.put(101,"Robert");
        System.out.println(" ------------ After adding the same key in hashmap ------------ ");
        System.out.println(hashMap);
        hashMap.putIfAbsent(101,"Rohan");
        System.out.println(hashMap);
    }
}

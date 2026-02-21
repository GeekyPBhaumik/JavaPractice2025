package com.corejavapractice.JavaPractice.collection.linkedhashmap;

import java.util.LinkedHashMap;

/**
 * Access Order of the LinkedHashMap can be changed
 * if we use a true flag in the constructor of the LinkedHashMap as below
 * The most recent element in such a LinkedHashMap will be the recently touched one
 */

public class DemoLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10,"Rohan");
        linkedHashMap.put(20,"Rohit");
        linkedHashMap.put(5,"Sayan");
        System.out.println(linkedHashMap);
        System.out.println("hashmap after updating the key");
        linkedHashMap.put(20,"Virat");
        System.out.println(linkedHashMap);

        LinkedHashMap<Integer,String> linkedHashMapWithAccessOrder = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMapWithAccessOrder.put(10,"Rohan");
        linkedHashMapWithAccessOrder.put(20,"Rohit");
        linkedHashMapWithAccessOrder.put(5,"Sayan");
        System.out.println(linkedHashMapWithAccessOrder);
        linkedHashMapWithAccessOrder.put(20,"Virat");
        System.out.println(linkedHashMapWithAccessOrder);
    }
}

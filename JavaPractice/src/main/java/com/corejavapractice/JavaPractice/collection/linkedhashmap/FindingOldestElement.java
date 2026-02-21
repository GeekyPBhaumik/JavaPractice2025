package com.corejavapractice.JavaPractice.collection.linkedhashmap;

import java.util.LinkedHashMap;

public class FindingOldestElement {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put(5,"One");
        linkedHashMap.put(2,"Four");
        linkedHashMap.put(4,"Two");
        linkedHashMap.put(5,"three");
        System.out.println("Oldest Key:"+linkedHashMap.keySet().iterator().next());
    }
}

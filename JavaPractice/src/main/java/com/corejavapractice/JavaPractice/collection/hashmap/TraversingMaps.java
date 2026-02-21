package com.corejavapractice.JavaPractice.collection.hashmap;

//Goal: Learn the different ways to loop through a Map. This is a common interview task.
//Try to write the code for these 4 methods using a HashMap<String, String> countryCapitals:
//KeySet: Loop through only the keys and then use get(key) to find the value.
//Values: Loop through only the values (ignoring the keys).
//EntrySet (Most Efficient): Loop through the Map.Entry objects to get both Key and Value at once.
//ForEach (Java 8+): Use the functional map.forEach((k, v) -> ...) style.

import java.util.HashMap;
import java.util.Map;

public class TraversingMaps {
    public static void main(String[] args) {
        HashMap<String,String> countryCapitals = new HashMap<>();
        countryCapitals.put("India","New Delhi");
        countryCapitals.put("USA","Washington D.C.");
        countryCapitals.put("Germany","Berlin");
        countryCapitals.put("France","Paris");
        System.out.println(" ---------- looping through the keys ---------- ");
        for(String countryKey:countryCapitals.keySet()){
            System.out.println("Value:"+countryCapitals.get(countryKey));
        }
        System.out.println(" ---------- loop through the values ignoring the keys ---------- ");
        for(String country:countryCapitals.values()){
            System.out.println(country);
        }
        System.out.println("-------- loop through the map to get both keys and values ----------");
        for(Map.Entry<String,String> entry:countryCapitals.entrySet()){
            System.out.println("key:"+entry.getKey()+",values:"+entry.getValue());
        }
        System.out.println("----------- for each java 8+ ------------");
        countryCapitals.forEach((k,v) -> System.out.println("Key:"+k+",Value:"+v));
    }
}

package com.corejavapractice.JavaPractice.collection.iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
//Traversed a List<String> of fruit names.
//Every time you find the word "Apple", replace it with "Orange",
//and immediately after that "Orange", insert a new element called "Fresh".

public class FindAndReplace {
    public static void main(String[] args) {
        List<String> fruitsList = new ArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Guava");
        fruitsList.add("Banana");
        fruitsList.add("Apple");
        fruitsList.add("Pineapple");
        ListIterator<String> itr = fruitsList.listIterator();
        while(itr.hasNext()){
            String current = itr.next();
            if("Apple".equals(current)){
                itr.set("Orange");
                itr.add("Fresh");
            }
        }
        System.out.println(fruitsList);
    }
}

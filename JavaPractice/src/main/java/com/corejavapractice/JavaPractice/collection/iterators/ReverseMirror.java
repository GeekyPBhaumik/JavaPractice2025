package com.corejavapractice.JavaPractice.collection.iterators;

//Take a List of Strings. Use a ListIterator to traverse to the end,
//then walk backward and print the elements in reverse.
//Additionally, while walking backward, if you find a String with a length of 1 (like "A"), remove it.

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ReverseMirror {
    public static void main(String[] args) {
        List<String> listStr = new ArrayList<>();
        listStr.add("Hello");
        listStr.add("A");
        listStr.add("World");
        listStr.add("B");
        ListIterator<String> listItr = listStr.listIterator(listStr.size());
        while(listItr.hasPrevious()){
            String current = listItr.previous();
            System.out.println(current);
            if(current.length()==1){
                listItr.remove();
            }
        }
        System.out.println(listStr);
    }
}

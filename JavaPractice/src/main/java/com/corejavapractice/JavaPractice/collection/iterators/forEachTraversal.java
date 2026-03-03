package com.corejavapractice.JavaPractice.collection.iterators;

import java.util.Arrays;
import java.util.List;

public class forEachTraversal {
    public static void main(String[] args) {
        List<String> sportsList = Arrays.asList("Cricket","Football","Volleyball");
        for(String sport:sportsList){
            System.out.println(sport);
        }
    }
}

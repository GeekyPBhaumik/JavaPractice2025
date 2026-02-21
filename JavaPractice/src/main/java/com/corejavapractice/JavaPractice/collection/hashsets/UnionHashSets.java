package com.corejavapractice.JavaPractice.collection.hashsets;

import java.util.Arrays;
import java.util.HashSet;

public class UnionHashSets {
    public static void main(String[] args) {
        HashSet<Integer> hashSetA = new HashSet<>(Arrays.asList(12,10,3,4,34));
        HashSet<Integer> hashSetB = new HashSet<>(Arrays.asList(9,23,12,89,3));
        HashSet<Integer> intersectionSet = new HashSet<>(hashSetA);
        intersectionSet.retainAll(hashSetB);
        System.out.println(intersectionSet);
        HashSet<Integer> unionSet = new HashSet<>(hashSetB);
        unionSet.addAll(hashSetB);
        System.out.println(unionSet);
    }
}

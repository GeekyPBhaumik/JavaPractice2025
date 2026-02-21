package com.corejavapractice.JavaPractice.collection.hashsets;
//Task: Write a program that takes an array of integers and finds the duplicate numbers using a HashSet.

import java.util.HashSet;

public class FindingDuplicates {
    public static void main(String[] args) {
        int numbers[] = {12,14,10,8,5,12,10,9,34};
        HashSet<Integer> duplicateSet = new HashSet<>();
        for(int num:numbers){
            if(!duplicateSet.add(num)){
                System.out.println("Duplicate Element Found:"+num);
            }
        }
    }
}

package com.corejavapractice.JavaPractice.arrays;

import java.util.Arrays;

public class JaggedArraysDemo {
    public static void main(String[] args) {
        int jaggedArr[][] = new int[3][];
        jaggedArr[0] = new int[2];
        jaggedArr[1] = new int[3];
        jaggedArr[2] = new int[5];
        System.out.println(Arrays.deepToString(jaggedArr));
        //Each Row having different no. of columns
    }
}

package com.corejavapractice.JavaPractice.arrays;

import java.util.Arrays;

/**
 * Use Arrays.toString to print the array only toString won't work as it will print the hashcode
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));
        int[] secondArr = {3,6,7};
        System.out.println(Arrays.toString(secondArr));
    }
}

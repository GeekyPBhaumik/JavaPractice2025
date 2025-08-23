package com.corejavapractice.JavaPractice.arrays;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];//rows - 3, columns - 4
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = count++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

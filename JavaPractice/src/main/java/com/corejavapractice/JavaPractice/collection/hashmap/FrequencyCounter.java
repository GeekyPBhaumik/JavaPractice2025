package com.corejavapractice.JavaPractice.collection.hashmap;

import java.util.HashMap;

public class FrequencyCounter {
    public static void main(String[] args) {
        //int count = 0;
        int[] arr = {2,5,2,3,4,4,6,7,3,9,2};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i:arr){
            if(!hashMap.containsKey(i))
                hashMap.put(i,1);
            else {
                //count = hashMap.get(i);
                hashMap.put(i, hashMap.getOrDefault(i,0)+1);
            }
        }
        System.out.println(hashMap);
    }
}

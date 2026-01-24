package com.corejavapractice.JavaPractice.collection;

import java.util.ArrayList;

//You have a list of student names.
//If "John" is in the list, replace it with "John Doe".
//If "John" is not present, add "New Student" to the end of the list.
//Methods practiced: indexOf(), set(), add(), contains().

public class ArrayListAddReplace {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Alice");
        arrList.add("John");
        arrList.add("Steve");
        System.out.println("Before Adding:"+arrList);
        if(arrList.contains("John")){
           int index = arrList.indexOf("John");
           arrList.set(index,"John Doe");
        }else{
            arrList.add("New John");
        }
        System.out.println("After Adding:"+arrList);
    }
}

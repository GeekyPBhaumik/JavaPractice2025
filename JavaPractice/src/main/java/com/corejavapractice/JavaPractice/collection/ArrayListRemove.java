package com.corejavapractice.JavaPractice.collection;

import java.util.ArrayList;

//Given a list of integers, remove all even numbers from the list.
//Trap is never traverse it forward using a loop and remove, it will shift the elements
//Always traverse backwards using a loop and remove, it will only remove the last visited element
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        arrList.add(4);
        arrList.add(7);
        arrList.add(9);
        arrList.add(10);
        for(int i=arrList.size()-1;i>=0;i--){
            if(arrList.get(i)%2==0){
                arrList.remove(i);
            }
        }
        System.out.println(arrList);
    }
}

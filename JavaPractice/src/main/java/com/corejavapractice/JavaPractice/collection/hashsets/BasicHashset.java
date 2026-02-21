package com.corejavapractice.JavaPractice.collection.hashsets;

import java.util.HashSet;
import java.util.Iterator;

//Task: Create a HashSet of Strings.
//Add 5 colors: "Red", "Blue", "Green", "Red", "Yellow".
//Print the size of the set (Notice how "Red" is handled).
//Check if "Purple" exists in the set.
//Remove "Green" and print the set using an Iterator.
public class BasicHashset {
    public static void main(String[] args) {
        HashSet<String> colorset = new HashSet<>();
        colorset.add("Red");
        colorset.add("Blue");
        colorset.add("Green");
        colorset.add("Red");
        colorset.add("Yellow");
        System.out.println("Size of the colorset is:"+colorset.size());
        if(!colorset.contains("Purple")){
            System.out.println("Does not contain Purple color");
        }else{
            System.out.println("It contains Purple color");
        }
        colorset.remove("Green");
        System.out.println("------------ After Removing Elements ----------- ");
        Iterator<String> itr = colorset.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

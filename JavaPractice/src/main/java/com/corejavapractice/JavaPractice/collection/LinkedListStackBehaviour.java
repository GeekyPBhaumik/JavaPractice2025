package com.corejavapractice.JavaPractice.collection;

//The "Undo Buffer" (Stack Behavior - LIFO/FILO)
//Suppose,we are building a text editor. Every time a user types a word, it’s added to a list.
//If they hit "Undo," the last word added should be removed.

import org.springframework.util.ObjectUtils;

import java.util.LinkedList;

public class LinkedListStackBehaviour {
    public static void main(String[] args) {
        LinkedList<String> actions = new LinkedList<>();
        actions.add("Typed Hello");
        actions.add("Typed Good");
        actions.add("Typed Morning");
        if(!ObjectUtils.isEmpty(actions)){
          String undoaction = actions.removeLast();
          System.out.println("Undo Action:"+undoaction);
        }
    }
}

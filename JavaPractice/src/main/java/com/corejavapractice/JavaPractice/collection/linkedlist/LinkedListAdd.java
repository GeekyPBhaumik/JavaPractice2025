package com.corejavapractice.JavaPractice.collection.linkedlist;

import java.util.LinkedList;

//You are managing a line at a bank. New customers join at the end,
// and the teller serves the person at the front.
// Print the name of the person being served and remove them.

public class LinkedListAdd {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Rohan");
        queue.add("Sunil");
        queue.add("Shubham");
        queue.add("Rohit");
        queue.add("Dhiraj");
        if(!queue.isEmpty()){
            String beingServed = queue.removeFirst();
            System.out.println("Now Serving:"+beingServed);
        }
        System.out.println("Remaining in Queue:"+queue);
    }
}

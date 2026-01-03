package com.corejavapractice.JavaPractice.regexPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. Lazy Match: \[(.*?)\\]
//The engine finds the first [.
//The .*? starts looking. Since it is lazy, it asks: "Can I stop now?"
//It checks if the next character is ].
//At the first ], the condition is met. It stops immediately.
//Group 1: a
//Group 2: ERROR (matches the text after the space and before the colon).
//2. Greedy Match: \[(.*)\]
//The engine finds the first [.
//The .* starts looking. Since it is greedy, it consumes the entire rest of the string to the very end.
//Then, it backtracks (moves backward from the end) until it finds a ].
//The first ] it hits while moving backward is the one after the b.
//Group 1: a] [b
//Group 2: ERROR
public class GreedyVsLazyDemo {
    public static void main(String[] args) {
        String[] inputs = {
                "[2023-10-12 14:20:01] ERROR: Database connection failed",
                "[a] [b] ERROR: Something happened"
        };
        String lazy = "\\[(.*?)\\]\\s+(.*?):.*";
        String greedy = "\\[(.*)\\]\\s+(.*?):.*";
        for (String s : inputs) {
            System.out.println("Input: " + s);

            Pattern pLazy = Pattern.compile(lazy);
            Matcher mLazy = pLazy.matcher(s);
            Pattern pGreedy = Pattern.compile(greedy);
            Matcher mGreedy = pGreedy.matcher(s);
            System.out.println(" ***************** Lazy **************** ");
            if (mLazy.find()) {
                System.out.println("Lazy group1: " + mLazy.group(1) + " | group2: " + mLazy.group(2));
            }
            System.out.println(" ***************** Greedy ******************** ");
            if(mGreedy.find()){
                System.out.println("Greedy group1: " + mGreedy.group(1) + " | group2: " + mGreedy.group(2));
            }
        }
    }
}
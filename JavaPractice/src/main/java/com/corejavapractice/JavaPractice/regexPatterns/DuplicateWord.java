package com.corejavapractice.JavaPractice.regexPatterns;
//The 4 Instructions
//  \b(\w+) — "Remember the first word" The robot finds a word (like "Hello") and writes it down on a sticky note. It labels this note "Group 1".
//  \s+ — "Look for a space" The robot checks if there is at least one space after that word.
//  \1 — "Check the sticky note" This is the "Find Duplicate" part. The \1 tells the robot: "Look at the next word in the string. Is it exactly what you wrote on sticky note #1?"
//  \b — "Make sure it's a full word" The robot ensures the match isn't just a part of a bigger word (like "cat" inside "category").

//Imagine the string is: "Apple apple Pie"
//Step 1: The robot sees Apple. It writes Apple on its sticky note.
//Step 2: It sees a space. (Check!)
//Step 3: It sees apple. It looks at its sticky note. Since we told it to ignore uppercase/lowercase, it says: "Hey! This matches my sticky note!"
//Step 4: It announces: "I found a duplicate!"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWord {
    public static void main(String[] args) {
        String input = "Hello hello World world";
        String regex = "\\b(\\w+)\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("Duplicate word was:"+matcher.group());
            System.out.println("The word was:"+matcher.group(1));
        }
    }
}

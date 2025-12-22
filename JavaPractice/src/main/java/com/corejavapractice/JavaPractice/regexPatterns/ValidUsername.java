package com.corejavapractice.JavaPractice.regexPatterns;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Validate a Username
//A valid username is 5-12 characters, alphanumeric only, and must start with a letter.
//1. The Anchors (^ and $)
//^ (Caret): This represents the start of the string. It ensures the match begins at the very first character.
//$ (Dollar sign): This represents the end of the string.

//2. The First Character ([a-zA-Z])
//This matches exactly one character.
//The range a-z is lowercase, and A-Z is uppercase.

//3. The Remaining Characters ([a-zA-Z0-9]{4,11})
//[a-zA-Z0-9]: This is a character class that allows letters (upper or lower) and digits (0-9).
//{4,11}: This is a quantifier. It says "match the previous group between 4 and 11 times."
//The Rule: After the first letter, you must have between 4 and 11 more alphanumeric characters.
//Total Length SummaryBecause you have 1 mandatory letter at the start, plus 4 to 11 more characters following it,
//the total length allowed is:Minimum: $1 + 4 = 5$ characters.Maximum: $1 + 11 = 12$ characters
public class ValidUsername {
    public static void main(String[] args) {
        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern validUsernamePattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]{4,11}$");
        Matcher usernameMatcher = validUsernamePattern.matcher(input);
        if(usernameMatcher.matches()){
            System.out.println(input+" is a valid username");
        }else{
            System.out.println(input+" is an invalid username");
        }
    }
}

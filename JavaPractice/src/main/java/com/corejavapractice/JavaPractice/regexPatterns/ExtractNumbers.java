package com.corejavapractice.JavaPractice.regexPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Extract Digits From String
public class ExtractNumbers {
    public static void main(String[] args) {
        String input = "Order #1234 was placed on 2023";
        Pattern pattern1 =  Pattern.compile("\\d+");
        Matcher matcher1 = pattern1.matcher(input);
        Pattern pattern2 = Pattern.compile("\\d");
        Matcher matcher2 = pattern2.matcher(input);
        while(matcher1.find()){
            System.out.println(" ------- Giving the matched string consisting of more than 1 digit -------");
            System.out.println(matcher1.group());
        }
        while(matcher2.find()){
            System.out.println(" ------- Giving the matched string only the single digits -------");
            System.out.println(matcher2.group());
        }
    }
}

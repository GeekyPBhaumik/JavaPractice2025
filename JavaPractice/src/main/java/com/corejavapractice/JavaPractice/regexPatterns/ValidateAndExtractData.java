package com.corejavapractice.JavaPractice.regexPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Validate and Extract Data from a Log Entry
//Short annotated pieces from your regex \[(.*?)\]\s+(.*?):.*:
//\[`\] — match literal [ and ] (escaped).
//(.*?) — capture minimal text inside the brackets.
//\s+ — whitespace after the closing bracket.
//(.*?): — capture minimal text before the colon.
//.* — rest of the line.
public class ValidateAndExtractData {
    public static void main(String[] args) {
        String log = "[2023-10-12 14:20:01] ERROR: Database connection failed";
        String regex = "\\[(.*?)\\]\\s+(.*?):.*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(log);
        if(matcher.find()){
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }
}

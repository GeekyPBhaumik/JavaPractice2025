// java
package com.corejavapractice.JavaPractice.regexPatterns;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractNumbersMultipleQuantifiers {
    public static void main(String[] args) {
        String input = "123455";

// We add "5" at the end of the regex to see if the quantifier
// is willing to give up a character it already grabbed.
        demonstrate("Single Digit (\\d)", "\\d", input);
        demonstrate("Greedy (\\d+5)", "\\d+5", input);
        demonstrate("Reluctant (\\d+?5)", "\\d+?5", input);
        demonstrate("Possessive (\\d++5)", "\\d++5", input);
    }
    private static void demonstrate(String title, String regex, String input) {
        System.out.println("---- " + title + " ----");
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println(m.group());
        }
        System.out.println();
    }
}

package com.corejavapractice.JavaPractice.string;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class StringJoinerAndJoinMethodDemo {
    public static void main(String[] args) {
        StringJoiner strJoiner = new StringJoiner(",");
        strJoiner.add("Mohit");
        strJoiner.add("Rahul");
        strJoiner.add("Rohan");
        strJoiner.add("Satish");
        System.out.println(strJoiner);
        StringJoiner strJoinerNew = new StringJoiner(", ","[","]");
        strJoinerNew.add("Apple");
        strJoinerNew.add("Mango");
        strJoinerNew.add("Orange");
        System.out.println(strJoinerNew);

        //Now join() method
        String sportsArr[] = {"Cricket","Football","Rugby","Basketball"};
        String sportStr = String.join(", ",sportsArr);
        System.out.println(sportStr);

        List<String> listCompanies = new ArrayList<>();
        listCompanies.add("Microsoft");
        listCompanies.add("JP Morgan");
        listCompanies.add("Google");
        listCompanies.add("RedHat");
        String companies = String.join("-", listCompanies);
        System.out.println(companies);
    }
}

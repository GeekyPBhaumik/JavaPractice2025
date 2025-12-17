package com.corejavapractice.JavaPractice.ioserialization;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Scanner Demo");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Entered Input:"+sum);
        System.out.println("Enter the Input String:");
        String inputStr = sc.next();
        System.out.println("Entered String:"+inputStr);

        System.out.println(" ******* Trailing New Line Handling ******** ");
        System.out.println("Enter Another Integer");
        int num3 = sc.nextInt();
        System.out.println(num3);
        System.out.println("Enter a New String");
        String line = sc.nextLine();
        System.out.println(line+" hey");
    }
}

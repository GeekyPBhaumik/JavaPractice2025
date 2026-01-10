package com.corejavapractice.JavaPractice.exceptionhandling;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(int age){
        System.out.println("InvalidAgeException Occured");
    }
}

public class throwKeywordDemo {
    public static void main(String[] args) throws InvalidAgeException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("Throwing Custom Exception");
            throw new InvalidAgeException(age);
        }else{
            System.out.println("Valid age provided");
        }
        Scanner scNew = new Scanner(System.in);
        System.out.println("Enter Your Value");
        int value = scNew.nextInt();
        if(value==0){
            System.out.println("Throwing Checked Exception");
            throw new ArithmeticException("Cannot divide by zero");
        }
    }
}

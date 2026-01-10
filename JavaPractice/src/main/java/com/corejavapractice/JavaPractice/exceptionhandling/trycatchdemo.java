package com.corejavapractice.JavaPractice.exceptionhandling;

public class trycatchdemo {
    public static void main(String[] args) {
        try {
            int num = 10;
            System.out.println("Divide num by Zero:"+ (num/0));
        }catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception Occured:"+ae);
        }catch(Exception e){
            System.out.println("Exception Occured:"+e);
        }finally{
            System.out.println("Finally Block Executed");
        }
    }
}

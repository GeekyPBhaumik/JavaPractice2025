package com.corejavapractice.JavaPractice.exceptionhandling;

import org.springframework.util.ObjectUtils;

import java.io.IOException;

public class throwsKeywordDemo {
    public static void processMethod(String message) throws IOException, ClassNotFoundException {
        if(ObjectUtils.isEmpty(message)){
            throw new IOException();
        }
        else{
            throw new ClassNotFoundException();
        }
    }
    public static void main(String[] args) {
        try{
            String message = "e";
            processMethod(message);
        }catch(IOException ie){
            System.out.println("IO Exception Occured:"+ie);
        }catch (ClassNotFoundException ce) {
            System.out.println("ClassNotFound Exception Occured:"+ce);
        }catch(Exception e) {
            System.out.println("Exceptin Occcured:"+e);
        }
    }
}

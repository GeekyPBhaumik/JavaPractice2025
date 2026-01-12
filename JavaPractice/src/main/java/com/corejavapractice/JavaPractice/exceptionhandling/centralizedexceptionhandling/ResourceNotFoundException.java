package com.corejavapractice.JavaPractice.exceptionhandling.centralizedexceptionhandling;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message){
        super(message);
    }
}

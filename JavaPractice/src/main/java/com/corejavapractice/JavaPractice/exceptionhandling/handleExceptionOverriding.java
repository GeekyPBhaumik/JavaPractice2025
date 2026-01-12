package com.corejavapractice.JavaPractice.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

class FileProcessor {
    void show() throws IOException{
        System.out.println("FileProcessor show method is executed");
    }
}

class TextFileProcessor extends FileProcessor {
    void show() throws FileNotFoundException{
        System.out.println("TextFileProcessor show method is executed");
    }
}

public class handleExceptionOverriding {
    public static void main(String[] args) throws IOException {
        FileProcessor process = new TextFileProcessor();
        process.show();
    }
}

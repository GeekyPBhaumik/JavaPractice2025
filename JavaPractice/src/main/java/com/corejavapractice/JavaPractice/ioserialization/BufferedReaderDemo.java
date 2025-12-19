package com.corejavapractice.JavaPractice.ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Acer\\Documents\\testing.txt"))){
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("Exception ocuured:"+e);
        }
    }
}

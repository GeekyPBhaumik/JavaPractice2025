package com.corejavapractice.JavaPractice.ioserialization;

import java.io.*;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\Acer\\Documents\\testing.txt";
        String destinationFile = "C:\\Users\\Acer\\Documents\\outputTesting.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile))){
            int lineNumber = 1;
            String line;
            while((line=br.readLine())!=null){
               System.out.println("Reading Input for LineNumber:"+lineNumber);
               bw.write(line);
               bw.newLine();
               lineNumber++;
            }
        }catch(IOException e){
            System.out.println("IO Exception:"+e);
        }
    }
}

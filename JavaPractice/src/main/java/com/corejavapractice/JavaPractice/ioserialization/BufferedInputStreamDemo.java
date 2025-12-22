package com.corejavapractice.JavaPractice.ioserialization;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args){
        String sourceFileImg = "C:\\Users\\Acer\\Documents\\Capture1.png";
        String destinationImg = "C:\\Users\\Acer\\Documents\\CaptureCopied.png";
        File sourceFile = new File(sourceFileImg);
        System.out.println("Total Input File Size:"+sourceFile.length());
        long totalBytesTransferred = 0;
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFileImg));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationImg))){
        byte[] buffer = new byte[8124];
        int bytesRead;
        //Reads up to buffer.length bytes of data from this input stream into an array of bytes
        while((bytesRead=bis.read(buffer))!=-1){
            bos.write(buffer,0,bytesRead);
            totalBytesTransferred+=bytesRead;
        }
        System.out.println("Chunks Written In total:"+totalBytesTransferred);
        //Explicit flush: ensure any remaining data in the buffer is pushed to disk
        bos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

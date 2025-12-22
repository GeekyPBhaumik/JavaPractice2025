package com.corejavapractice.JavaPractice.serialization;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        User user = new User("Rocky","secret1223");
        String fileName = "C:\\Users\\Acer\\Documents\\user.ser";
        System.out.println("Serialization Starting");
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(user);
            System.out.println("Object has been serialized: " + user);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Deserialization Starting");
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            User deserializedUserObj = (User)in.readObject();
            System.out.println("Object has been deserialized");
            System.out.println("Username:"+deserializedUserObj.getUsername());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

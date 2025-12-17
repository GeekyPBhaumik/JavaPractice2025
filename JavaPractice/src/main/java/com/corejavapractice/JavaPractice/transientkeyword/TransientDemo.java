package com.corejavapractice.JavaPractice.transientkeyword;

import lombok.Getter;

import java.io.*;

@Getter
class User implements Serializable {
    private String username;
    private transient String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
}

public class TransientDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("Rocky","secretKey");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
        out.writeObject(user);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));
        User userDetails = (User)in.readObject();
        in.close();

        System.out.println(userDetails.getUsername());
        System.out.println(userDetails.getPassword());
    }
}

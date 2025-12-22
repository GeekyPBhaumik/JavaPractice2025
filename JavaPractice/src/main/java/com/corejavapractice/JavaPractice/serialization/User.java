package com.corejavapractice.JavaPractice.serialization;

import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
public class User implements Serializable {
    private static final long serialVersionUID = -1;
    private String username;
    private transient String password;
    public User(String username,String password){
        this.username = username;
        this.password = password;
    }
}

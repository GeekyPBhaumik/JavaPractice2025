package com.corejavapractice.JavaPractice.shallowdeepcopy.cloneable;

public class User  implements Cloneable{
    public String name;
    public int rollNum;
    public Address addr;

    public User(String name, int rollNum, Address addr){
        this.name = name;
        this.rollNum = rollNum;
        this.addr = addr;
    }

    @Override
    public String toString(){
        return "User[name"+name+",rollNum="+rollNum+",address="+addr+"]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user = null;
        try {
            user = (User) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        user.addr = (Address)this.addr.clone();
        return  user;
    }
}

package com.corejavapractice.JavaPractice.ShallowDeepCopy;

/**
 * Shallow copy is basically if we create a copy of another object, then changing the reference type field of the copied object
 * will also change the corresponding field of the original object
 * Deep copy is basically if we create a copy of another object, then changing the reference type field of the copied object
 * won't change the corresponding field of the original object
 */
public class Driver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address userAddr = new Address("Hinjewadi Phase-I","Pune","India",411057);
        User userDetailsObj = new User("Pushpan",32,userAddr);
        User clonedUserDetailsObj = (User) userDetailsObj.clone();

        System.out.println("Before Changing the details");
        System.out.println(userDetailsObj);
        System.out.println(clonedUserDetailsObj.toString());

        clonedUserDetailsObj.addr.location = "Kharadi";

        System.out.println("After Changing the details");
        System.out.println(userDetailsObj);
        System.out.println(clonedUserDetailsObj);
    }
}

package com.corejavapractice.JavaPractice.singleton;

public class EagerSingleton {
    //declaring it using final so that the value remains same.
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    //private constructor so that no other class can create a new object of this class
    private EagerSingleton(){}

    //static method so that we can call this method to return the instance.
    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        EagerSingleton eagerSingletonOne = EagerSingleton.getInstance();
        EagerSingleton eagerSingletonTwo = EagerSingleton.getInstance();
        System.out.println(eagerSingletonOne.hashCode());
        System.out.println(eagerSingletonTwo.hashCode());
        System.out.println(eagerSingletonOne==eagerSingletonTwo);
    }
}

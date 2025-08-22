package com.corejavapractice.JavaPractice.singleton;

public class LazySingleton {

    // 1. Declare the private static instance as null initially.
    private static LazySingleton lazySingletonInstance;

    //2. private constructor so that no other class can create a new object of this class
    private LazySingleton(){}

    // 3. Provide a synchronized public static method to get the instance.
    // The synchronized keyword ensures that only one thread can access this method at a time.
    public static synchronized LazySingleton getInstance(){
        if(lazySingletonInstance == null){
            lazySingletonInstance = new LazySingleton();
        }
        return lazySingletonInstance;
    }

    public static void main(String[] args) {
        LazySingleton lazySingletonInstanceOne = LazySingleton.getInstance();
        LazySingleton lazySingletonInstanceTwo = LazySingleton.getInstance();
        System.out.println(lazySingletonInstanceOne.hashCode());
        System.out.println(lazySingletonInstanceTwo.hashCode());
        System.out.println(lazySingletonInstanceOne==lazySingletonInstanceTwo);
    }
}

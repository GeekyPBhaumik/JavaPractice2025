package com.corejavapractice.JavaPractice.corejava;

// Interface for a Flyer
interface Flyable {
    void fly();
}

// Interface for a Swimmer
interface Swimmable {
    void swim();
}

// A Duck can both Fly and Swim
// The class must provide a single implementation for each method.
class Duck implements Flyable, Swimmable {

    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.fly();
        myDuck.swim();
    }
}


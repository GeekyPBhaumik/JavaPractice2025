package com.corejavapractice.JavaPractice.oops;
/*
   Interface is basically called blueprint of a class because
   it defines the behaviour of a class.
   It helps us to achieve 100% abstraction because
   all the methods are by default public, abstract.
   all the fields are by default public, static & final.
   we use the keyword implements for a class to implement an interface
   Generally an interface extends another interface.
   A class can implement more than one interface,an interface extend more than one interface

   An interface represents an 'IS-A' relationship because a class
   which implements the interface behaves as per the behaviour declaration provided in the interface
   Like a Dog class implements the behaviour of an interface Animal.
   So A Dog class IS-A Animal. Or Dog extends Animal class.
   In both cases, Animal represents IS-A relationship
   Basically it is either inheriting an Animal class
   or behaving like an Animal interface so in this way
   interface represents an IS-A relationship
 */

interface Vehicle{
    public static final String SPEED = "20 KMPH";
    void sound();
    void displaySpeed(String speed);
}

class Car2 implements Vehicle{
    @Override
    public void sound() {
        System.out.println("brrrr brrrr");
    }
    @Override
    public void displaySpeed(String speed) {
        System.out.println("Car is moving at:"+speed);
        System.out.println("Car was moving at:"+Vehicle.SPEED);
    }
}

public class InterfaceAbstraction {
    public static void main(String[] args) {
       Car2 car = new Car2();
       car.displaySpeed("100 kmph");
       car.sound();
    }
}
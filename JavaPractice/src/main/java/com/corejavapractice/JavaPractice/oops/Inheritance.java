package com.corejavapractice.JavaPractice.oops;
/*
Inheritance is the mechanism in Java by which a subclass is able to inherit the
features of it's parent class.
It helps to achieve abstraction and run time polymorphism
Inheritance has different types - Single Inheritance, Multi-level inheritance,
Hierarchical inheritance, Multiple inheritance, Hybrid inheritance.
Multiple Inheritance in Java is not supported/achieved through classes.
Multiple Inheritance in Java is supported through Interface.
*/
class BigVehicle{
    public String getName(String vehicleName){
        return "Speed of "+vehicleName+" is: ";
    }
    public int getSpeed(int speed){
        return speed;
    };
}
class Bus extends BigVehicle{
    @Override
    public int getSpeed(int speed){
        return super.getSpeed(speed);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Bus bus = new Bus();
        System.out.println(bus.getName("bus") + bus.getSpeed(50));
    }
}

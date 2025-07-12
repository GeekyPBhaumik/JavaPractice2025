package com.corejavapractice.JavaPractice.oops;

/*
Encapsulation is one of the 4 pillars of object-oriented programming
which helps to protect the internal state of an object with the help of
access modifiers & class variables. It is the process of wrapping up of data under a
single unit i.e. a class. It helps to make the data not accessible from outside world.
Helps in Data Hiding.

Why encapsuation?
Protection Against Accidental Corruption and Inconsistent State:
This is perhaps the most crucial aspect of "protecting the internal state."

Imagine if the balance in our BankAccount class was public. Any part of the code could do myAccount.balance = -500;.
This would put the bank account into an invalid or inconsistent state.

By making balance private and providing a deposit() and withdraw() method, we can embed validation logic directly within those methods.
deposit() can check if amount > 0.
withdraw() can check if amount > 0 AND amount <= balance
*/
public class Encapsulation {
    public static void main(String[] args) {
       Car car = new Car();
       car.setCarParams(40,"Safari","Tata");
       System.out.println(car.getBrand()+" "+car.getName()+" is travelling at "+car.getSpeed()+" speed");
    }
}
class Car{
    private int speed;
    private String name;
    private String brand;
    public int getSpeed() {
        return speed;
    }
    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public void setCarParams(int speed,String name, String brand){
        this.speed = speed;
        this.name = name;
        this.brand = brand;
    }
}
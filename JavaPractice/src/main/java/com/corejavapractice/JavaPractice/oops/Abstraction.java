package com.corejavapractice.JavaPractice.oops;

/**
 * Abstraction is the process of hiding the implementation details and
 * showing only the essential details to user.
 */
//Abstract class is used to achieve abstraction in Java that is partial abstraction
//Abstract classes can have both abstract and non-abstract(concrete) methods
//Abstract class is declared using an abstract keyword
//Abstract classes cannot be instantiated
//Class which extends an abstract class needs to override all the abstract classes
//We can create constructors for abstract class
//When a class extends an abstract class in Java, if the abstract class has a constructor that takes parameters,
// the subclass's constructor must explicitly call one of the abstract class's constructors
// using the super() keyword.
//A class in Java can only extend one abstract class.


abstract class Shape{
    private String color;
    public abstract double area();
    public String getColor(){
      return color;
    }
    public Shape(String color){
        System.out.println("Shape Constructor called");
        this.color = color;
    }
}

class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Circle circle1 = new Circle("Red",20.2);
        System.out.println("Area of the circle1 is:"+Math.round(circle1.area()));
        System.out.println("Color of the circle 1 is:"+circle1.getColor());
    }
}

package com.corejavapractice.JavaPractice.oops;
/*
 Polymorphism is one of the important concepts of Object-Oriented Programming (OOP).
It is the ability of an object to take on many forms, or the ability of a single interface
to represent different underlying forms. 'Poly' means many, and 'morph' means forms,
hence 'many forms'.

There are two main types of polymorphism in Java:

i. Method Overloading (Compile-time Polymorphism / Static Binding):
   It is a type of polymorphism where multiple methods within the same class have the
   same name but differ in their **parameter list**. The differences in the parameter list
   can be in:
   - The **number of parameters**.
   - The **data type of parameters**.
   - The **order of parameters** if the types are different.
   The return type of overloaded methods can be the same or different, but the return type
   alone is not sufficient to distinguish overloaded methods. The compiler determines
   which overloaded method to call at compile time based on the arguments provided.

ii. Method Overriding (Runtime Polymorphism / Dynamic Binding):
    It is a type of polymorphism where a method in a subclass provides its own
    specific implementation for a method that is already declared in its superclass.
    The method in the subclass is said to "override" the method in the superclass.
    Key characteristics:
    - Both methods (in the superclass and subclass) must have the **same method name**.
    - Both methods must have the **same parameter list** (number, type, and order of parameters).
    - The overriding method in the subclass must have a return type that is either
      **identical** to or a **covariant subtype** of the return type of the overridden method
      in the superclass.
    - Both methods exist in **different classes**, specifically in a parent-child (inheritance) relationship.
    The JVM determines which overridden method to call at runtime based on the actual
    type of the object.
 */
class Person{
    public void role(){
        System.out.println("Different roles");
    }
}

class Son extends Person{
    @Override
    public void role(){
        System.out.println("Role of a son");
    }
    //Method overloading
    public String role(String name){
        return "His name is:"+name+" and his role is of a Son";
    }
}

class Father extends Person{
    @Override
    public void role(){
        System.out.println("Role of a Father");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Person p;
        p = new Son();
        p.role();//if u try to call here another role method with parameters.
        //then it won't call as it will give syntax error as the object we created is of Person
        //so call the role method with param won't work as it is added in Son class.
        //only the role method with no params can be called.
        p = new Father();
        p.role();
    }
}

package com.corejavapractice.JavaPractice.statickeyword;



class Parent{
    static void display(){
        System.out.println("Display called from Parent");
    }
    void visualize(){
        System.out.println("Visualize called from Parent");
    }
}

class Child extends Parent{
    static void display(){
        System.out.println("Display called from Child");
    }
    @Override
    void visualize(){
        System.out.println("Visualize Called from Child");
    }
}

public class NotOverridingStaticMethodDemo{
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.visualize();
        obj.display();
    }
}

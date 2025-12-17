package com.corejavapractice.JavaPractice.thiskeyword;

public class ThisKeywordDemo {
    int x;
    ThisKeywordDemo(){
        this(120); //this is used for constructor chaining
        System.out.println("Constructor Chaining Completed");
        System.out.println("Passing Current Object");
    }
    ThisKeywordDemo(int x){
        System.out.println("Parameterized Constructor Called");
        this.x=x;
        System.out.println("Shadow Variable Resolved");
    }
    ThisKeywordDemo demoMethod(){
        System.out.println("Using this to return current object");
        return this;
    }

    void callDisplay(ThisKeywordDemo callObj){
        System.out.println("Calling Display Method");
        callObj.display();
    }

    void display(){
        System.out.println("Display method called");
    }

    public static void main(String[] args) {
        ThisKeywordDemo obj1 = new ThisKeywordDemo(100);
        ThisKeywordDemo obj2 = obj1.demoMethod();
        System.out.println(obj1);
        System.out.println(obj2);
        ThisKeywordDemo obj3 = new ThisKeywordDemo();
    }
}

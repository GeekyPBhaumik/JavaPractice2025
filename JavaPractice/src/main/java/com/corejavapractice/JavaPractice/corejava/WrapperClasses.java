package com.corejavapractice.JavaPractice.corejava;

public class WrapperClasses {
    public static void main(String[] args) {
        //Autoboxing
        System.out.println("Starting Autoboxing");
        int primitiveInt = 20;
        Integer wrapperInt = primitiveInt;
        System.out.println(wrapperInt);
        //Unboxing
        System.out.println("Starting Unboxing");
        Integer anotherWrapper = 30;
        int anotherPrimitive = anotherWrapper;
        System.out.println(anotherPrimitive);
        //Utility methods to convert string to Integer
        String str = "20";
        Integer parsedInteger = Integer.parseInt(str);
        System.out.println("Converting String to Integer:"+parsedInteger);
        //Type Conversion
        //Widening
        int x = 20;
        double y = x;
        System.out.println("Widening:"+y);
        int z = (int) y;
        System.out.println("Narrowing:"+z);
    }
}

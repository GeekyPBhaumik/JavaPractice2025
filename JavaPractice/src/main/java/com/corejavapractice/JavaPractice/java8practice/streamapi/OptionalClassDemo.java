package com.corejavapractice.JavaPractice.java8practice.streamapi;

import org.springframework.util.ObjectUtils;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        //Creating Optionals
        //Create an Optional with the value "Hello" and print it using get().
        Optional<String> str = Optional.of("Hello");
        System.out.println(str.get());

        //Create an Optional using ofNullable() where the value is null
        //and print whether it is present or not using isPresent().
        Optional<String> newStr = Optional.ofNullable("Hey");
        newStr.ifPresent(x -> System.out.println(x));

        //orElse() and orElseGet()
        //Create an empty Optional of type String and use orElse() to return "Default Value" and print it.
        Optional<String> dummy = Optional.empty();
        String defaultValue = dummy.orElse("Default Value Returned");
        System.out.println(defaultValue);

        //Create an empty Optional of type String and use orElseGet()
        //to return "Generated Value" using a Supplier and print it.
        Optional<String> emptyOptional = Optional.empty();
        String newDefault = emptyOptional.orElseGet(()->"Default Value Using orElseGet Method");
        System.out.println(newDefault);

        //ifPresent()
        //Create an Optional with value "Alice" and use ifPresent()
        // to print the name in uppercase only if value is present.
        Optional<String> name = Optional.ofNullable("alice");
        name.ifPresent(x-> System.out.println(x.toUpperCase())) ;

        //Create an empty Optional and use ifPresent() — observe that nothing happens and no exception is thrown.
        emptyOptional.ifPresent(x-> System.out.println("Optional is not empty"));

        //map()
        //Create an Optional with value "alice" and use map() to convert it to uppercase and print the result.
        String uppercaseName = name.map(String::toUpperCase).get();
        System.out.println(uppercaseName);

        //Create an Optional with value "Alice" and use map() to get the length of the name and print it.
        int lengthStr = name.map(x->x.length()).get();
        System.out.println(lengthStr);

        //directly if we want to print
        name.map(String::length).ifPresent(System.out::println);

        //filter()
        //Create an Optional with value 25 and use filter() to check if age is greater than 18
        // — print whether result is present or not.
        Optional<Integer> num = Optional.ofNullable(25);
        System.out.println(num.filter(x->x>18).isPresent());

        //Create an Optional with value 15 and use filter() to check if age is greater than 18
        // — observe that result is empty.
        Optional<Integer> num2 = Optional.ofNullable(15);
        System.out.println(num2.filter(x->x>18).isPresent());

        //Create an empty Optional and use orElseThrow()
        //to throw a RuntimeException with message "Value not found".
        try {
            String value = emptyOptional.orElseThrow(() -> new RuntimeException("Value Not Found"));
            System.out.println(value);
        }catch(Exception e){
            System.out.println("Exception Occured:"+e);
        }

        //Given this method that might return null:
        //public static String findStudentById(int id) {
        // if (id == 1) return "Alice";
        //return null;
        //}
        //Wrap the result in an Optional using ofNullable(),
        // and if value is present print the name in uppercase, otherwise print "Student not found"
        Optional<String> optionalName = Optional.ofNullable(findStudentById(10));
        String studentName = optionalName.map(String::toUpperCase).orElse("Student not found");
        System.out.println(studentName);

        //Create an Optional with value "  " (blank string), use filter() to check
        //if the string is not blank, and use orElse() to return "Name is blank" if filtered out.
        Optional<String> emptyName = Optional.ofNullable(" ");
        System.out.println(emptyName.filter(x->!x.isBlank()).orElse("Name is blank"));

        //Create an Optional with value "alice bob", use map() to convert to uppercase,
        //then use filter() to check if it starts with "ALICE",
        //and finally print the result using orElse("Not matched").
        Optional<String> optionalValue = Optional.ofNullable("alice bob");
        String result = optionalValue.map(String::toUpperCase).filter(x->x.startsWith("A")).orElse("Not matched");
        System.out.println(result);
    }

    public static String findStudentById(int id) {
         if (id == 1)
             return "Alice";
         return null;
    }
}

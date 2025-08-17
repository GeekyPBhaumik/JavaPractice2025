package com.corejavapractice.JavaPractice.shallowdeepcopy.copyconstructors.students;

/*
The concept of Copy Constructor is we will be creating a class in which we will be having a
constructor which will take the parameter of its own object and any reference type it will create newly.
as we can see in Student deep copy constructor, for courses, it is doing this.courses = new ArrayList<>();
It is the first step for making a deep copy.
Then from the object send in the copy constructor, we will copy the same contents in our reference type.
While copying, we will use the new keyword for example: here Course so that changing the course class values
also won't affect the original object which will eventually make it a deep copy.
*/


import java.util.ArrayList;
import java.util.List;
/*
The concept of Copy Constructor is we will be creating a class in which we will be having a
constructor which will take the parameter of its own object and any reference type it will create newly.
as we can see in Student deep copy constructor, for courses, it is doing this.courses = new ArrayList<>();
It is the first step for making a deep copy.
Then from the object send in the copy constructor, we will copy the same contents in our reference type.
While copying, we will use the new keyword for example: here Course so that changing the course class values
also won't affect the original object which will eventually make it a deep copy.
*/
public class Main {
    public static void main(String[] args) {
        // Create a list of courses for the original student
        List<Course> aliceCourses = new ArrayList<>();
        aliceCourses.add(new Course("Data Structures", "CS101"));
        aliceCourses.add(new Course("Algorithms", "CS102"));

        // Create the original Student object
        Student alice = new Student(101, "Alice", aliceCourses);
        System.out.println("Original Student (alice):");
        System.out.println(alice);
        System.out.println("---------------------------------");

        // Create a new Student object using the DEEP COPY constructor
        Student aliceCopy = new Student(alice);
        System.out.println("Deep Copied Student (aliceCopy):");
        System.out.println(aliceCopy);
        System.out.println("---------------------------------");

        // --- PROVING THE DEEP COPY ---
        // Modify the original student's list of courses
        alice.addCourse(new Course("Database Systems", "CS201"));

        // Get the list of courses from the original student and modify a course name
        List<Course> aliceOriginalList = alice.getCourses();
        aliceOriginalList.get(0).setCourseName("Advanced Data Structures"); // Assume a setter exists for the course class

        // Now, let's print both objects again to see the effect
        System.out.println("Original Student (alice) AFTER MODIFICATION:");
        System.out.println(alice);
        System.out.println("---------------------------------");

        System.out.println("Deep Copied Student (aliceCopy) AFTER ORIGINAL WAS MODIFIED:");
        System.out.println(aliceCopy); // This should be unchanged
        System.out.println("---------------------------------");

        // Check if the list objects themselves are different
        System.out.println("Are the course lists the same object? " + (alice.getCourses() == aliceCopy.getCourses()));
    }
}

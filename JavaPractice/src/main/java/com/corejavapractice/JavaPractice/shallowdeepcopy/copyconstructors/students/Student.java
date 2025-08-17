package com.corejavapractice.JavaPractice.shallowdeepcopy.copyconstructors.students;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Course> courses;

    // Regular Constructor
    public Student(int id, String name, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.courses = courses; // This is a shallow copy here, as it just assigns the reference
    }

    // Deep Copy Constructor
    public Student(Student other) {
        // 1. Copy primitive and immutable fields (shallow copy is fine)
        this.id = other.id;
        this.name = other.name;

        // 2. Perform a DEEP COPY for the mutable List<Course> field
        // Create a NEW ArrayList for the new object
        this.courses = new ArrayList<>();

        // Iterate through the original object's list
        // and add a new copy of each Course object to the new list.
        for (Course course : other.courses) {
            this.courses.add(new Course(course)); // This uses the Course copy constructor
        }

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(new Course(course));
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }
}
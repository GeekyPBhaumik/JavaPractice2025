package com.corejavapractice.JavaPractice.ShallowDeepCopy.CopyConstructors.Students;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Course {
    private String courseName;
    private String courseCode;

    // Constructor
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    // Copy Constructor (for deep copying)
    public Course(Course other) {
        this.courseName = other.courseName;
        this.courseCode = other.courseCode;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseCode='" + courseCode + '\'' +
                '}';
    }
}
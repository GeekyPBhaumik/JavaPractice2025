package com.corejavapractice.JavaPractice.string;

import java.util.Date;

// Rule 1: The class is final to prevent it from being extended
public final class CustomImmutableStudentClass {
    // Rule 2: All fields are private and final
    private final int id;
    private final String name;
    private final Date admissionDate; //mutable object

    // Rule 3: No setter methods are provided

    public String getName() {
        return name;
    }

    public Date getAdmissionDate() {
        // Rule 4: Returning a defensive copy of the mutable object
        System.out.println(" ========== Returning a new copy of the mutable object ============");
        return new Date(admissionDate.getTime());
    }

    public CustomImmutableStudentClass(int id, String name, Date admissionDate){
        this.id = id;
        this.name = name;
        // Rule 4: Creating a defensive copy of the mutable object in the constructor
        System.out.println("======= Creating a Defensive Copy of the Mutable Date Object ========");
        this.admissionDate = new Date(admissionDate.getTime());
    }

    @Override
    public String toString() {
        return "CustomImmutableStudentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", admissionDate=" + admissionDate +
                '}';
    }

    public static void main(String[] args) {
        Date dob = new Date();
        CustomImmutableStudentClass firstStudent = new CustomImmutableStudentClass(101,"Rohan",dob);
        System.out.println("Initial Student Object:");
        System.out.println(firstStudent);
        System.out.println(" ============== Modifying the Original Date Object =============== ");
        dob.setTime(0);
        System.out.println("After Modifying the Mutable Date Object Inside Student:");
        System.out.println(firstStudent);
        System.out.println("Original Student Object Still Remains Intact");

        Date admissionDateObj = firstStudent.getAdmissionDate();
        System.out.println(" ========= Modifying the Retrieved Date Object ========= ");
        admissionDateObj.setTime(1000);
        System.out.println("After Modifying the retrieved date object:"+firstStudent);
    }
}
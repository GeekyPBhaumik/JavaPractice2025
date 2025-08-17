package com.corejavapractice.JavaPractice.shallowdeepcopy.copyconstructors.employees;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Skills skillOne = new Skills("Software Engineering","DevOps");
        Skills skillTwo = new Skills("Software Engineering","Java FS");
        List<Skills> empSkills = new ArrayList<>();
        empSkills.add(skillOne);
        empSkills.add(skillTwo);

        Employees empOne = new Employees("Sagar","IT",empSkills);
        System.out.println("--------------- Original Employee Created ------------------");
        System.out.println("Name:"+empOne.getName());
        System.out.println(empOne);
        Employees empOneCopy = new Employees(empOne);
        System.out.println("---------------- Copied Employee Created ------------------");
        System.out.println(empOne);

        empOne.addSkills(new Skills("Software Testing","Java Selenium"));
        System.out.println("--------------- Original Employee After Adding Skill ----------------");
        System.out.println(empOne);
        System.out.println("--------------- Copied Employee After Adding Skill To Original Employee ----------------");
        System.out.println(empOneCopy);

        empOneCopy.getSkills().get(0).setTechnology("Power BI");
        empOneCopy.getSkills().get(0).setDomain("Data Engineering");
        System.out.println("-------------- Original Employee ------------------");
        System.out.println(empOne);
        System.out.println("-------------- Copied Employee ----------------");
        System.out.println(empOneCopy);
    }
}

package com.corejavapractice.JavaPractice.shallowdeepcopy.copyconstructors.employees;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Employees {
    private String name;
    private String dept;
    private List<Skills> skills;

    public Employees(String name, String dept, List<Skills> skills){
        System.out.println("----------------Employees Regular Constructor Called-----------------");
        this.name = name;
        this.dept = dept;
        this.skills = skills;
    }

    public Employees(Employees emp){
        System.out.println("-----------------Employees Deep Copy Constructor Called------------------");
        this.name = emp.name;
        this.dept = emp.dept;
        this.skills = new ArrayList<>();

        for(Skills skill:emp.skills){
            this.skills.add(new Skills(skill));
        }
    }

    public void addSkills(Skills skill){
        this.skills.add(new Skills(skill));
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", skills=" + skills +
                '}';
    }
}

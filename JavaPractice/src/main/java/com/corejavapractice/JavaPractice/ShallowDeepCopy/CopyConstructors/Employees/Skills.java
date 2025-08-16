package com.corejavapractice.JavaPractice.ShallowDeepCopy.CopyConstructors.Employees;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skills {
    private String domain;
    private String technology;

    public Skills(String domain, String technology){
        System.out.println("------------- Skills Regular Copy Constructor Called --------------- ");
        this.domain = domain;
        this.technology = technology;
    }

    public Skills(Skills skill){
        System.out.println("------------- Skills Deep Copy Constructor Called --------------- ");
        this.domain = skill.domain;
        this.technology = skill.technology;
    }

    @Override
    public String toString() {
        return "Skills{" +
                "domain='" + domain + '\'' +
                ", technology='" + technology + '\'' +
                '}';
    }
}

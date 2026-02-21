package com.corejavapractice.JavaPractice.collection.hashsets;

import java.util.HashSet;
import java.util.Objects;

class Employee{
    private int id;
    private String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || this.getClass()!=o.getClass()) return false;
        Employee e = (Employee) o;
        return this.id==e.getId() || Objects.equals(name,e.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class CustomObjectOperation {
    public static void main(String[] args) {
        HashSet<Employee> empSet= new HashSet<>();
        empSet.add(new Employee(1,"Vikram"));
        empSet.add(new Employee(2,"Vinod"));
        empSet.add(new Employee(1,"Vikram"));
        System.out.println(empSet.size());
    }
}

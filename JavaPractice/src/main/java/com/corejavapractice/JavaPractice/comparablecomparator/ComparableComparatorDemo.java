package com.corejavapractice.JavaPractice.comparablecomparator;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ToString
@Getter
class Student implements Comparable<Student>{
  private int id;
  private String name;

  public Student(int id, String name){
      this.id=id;
      this.name=name;
  }
    @Override
    public int compareTo(Student o) {
        return this.id-o.id;
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class IdComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1,Student s2){
       return s1.getId() - s2.getId();
    }
}

public class ComparableComparatorDemo {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Student firstStu = new Student(104,"Rohan");
        Student secondStu = new Student(102,"Sachin");
        Student thirdStu = new Student(103,"Ravi");
        List<Student> listStudentCopy = new ArrayList<>();
        listStudent.add(firstStu);
        listStudent.add(secondStu);
        listStudent.add(thirdStu);
        listStudentCopy.addAll(listStudent);
        System.out.println(" ========== Before Applying Sorting ==========");
        listStudent.forEach(System.out::println);
        System.out.println(" =========== After Applying Sorting =========== ");
        Collections.sort(listStudent);
        listStudent.forEach(System.out::println);
        System.out.println(" =========== Sorting By Id ==============");
        listStudentCopy.sort(new IdComparator()); //we can use list.sort instead of Comparator.sort
        listStudentCopy.forEach(System.out::println);
        System.out.println(" =========== Sorting By Name  ============ ");
//      Collections.sort(listStudentCopy,new NameComparator());
//      listStudentCopy.forEach(System.out::println);
        listStudentCopy.sort(Comparator.comparing(Student::getName)); //we don't need a separate boilerplate code
        listStudentCopy.forEach(System.out::println);
    }
}

package com.corejavapractice.JavaPractice.java8practice.streamapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.*;
import java.util.stream.Collectors;

@AllArgsConstructor
@Data
class Employee{
    private String name;
    private int salary;
    private String dept;
}

public class TopInterviewQuestions {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Rohit",34000,"IT"),
                new Employee("Suresh",89000,"IT"),
                new Employee("Dinesh",12000,"HR"),
                new Employee("Karthik",45000,"INFRA"),
                new Employee("Rohan",25000,"HR"),
                new Employee("Dheeraj",95000,"INFRA"),
                new Employee("Nikhil",15000,"HR"));
        //Q1: Find the 2nd highest salary from a list
        int secondHighest = employees.stream().map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);
        System.out.println("Second Highest Salary:"+secondHighest);

        //Q2: Group employees by department, find max salary in each
        Map<String, Optional<Integer>> mapDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.mapping(Employee::getSalary,
                                Collectors.maxBy(Comparator.naturalOrder()))));
        mapDept.forEach((dept,sal)->
                System.out.println("Dept:"+dept+",Max Salary:"+sal.orElse(0)));
        //Explanation:
        //What each part does:
        //Step 1 — groupingBy(Employee::getDept)
        //- Groups all employees by their department
        //- Creates a Map where key = department name
        //HR=[Employee(name="abc",salary=12000),Employee(name="def",salary=45600],IT=[],INFRA=[]

        //Step 2 — Collectors.mapping(Employee::getSalary, ...)
        //- By default groupingBy gives List<Employee> per department
        //- mapping() extracts **only the salary** from each Employee
        //- Now downstream collector works on `List<Integer>` instead of List<Employee>

        //Step 3 — Collectors.maxBy(Comparator.naturalOrder())
        //- Works on the extracted salaries `[34000, 89000]`
        //- naturalOrder() tells it to compare integers normally smallest to largest
        //- Returns the largest salary as `Optional<Integer>


        //Q3: Count frequency of characters in a string
        String word ="Java";
        List<Character> listChar = word.chars().mapToObj(c->(char)c).toList();
        Map<Character,Long> charCountMap = listChar.stream()
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        System.out.println(charCountMap);

        //Q4: Find first non-repeating character in a string
        String str = "character";
        LinkedHashMap<Character,Long> linkedHashMap = str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
        Character nonRepeatChar = linkedHashMap.entrySet()
                .stream()
                .filter(x->x.getValue().equals(1L)) //==1 ALSO WORKS BUT THIS IS SAFER
                .map(Map.Entry::getKey)
                .findFirst().orElse('N');
        System.out.println("First Non Repeating Character:"+nonRepeatChar);

        //Q4: Find all duplicate elements in a list
        //Approach 1
        List<String> listSports = Arrays.asList("Football","Cricket","VolleyBall","BasketBall","VolleyBall","Cricket");
        Map<String, Long> countMap = listSports.stream().
                collect(Collectors.groupingBy(s->s,Collectors.counting()));
        List<String> duplicateList = countMap.entrySet().stream().filter(x->x.getValue()>1)
                .map(Map.Entry::getKey).toList();
        System.out.println(duplicateList);

        //Approach 2
        List<Integer> nums = List.of(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> seen = new HashSet<>();

        List<Integer> duplicates = nums.stream()
                .filter(n -> !seen.add(n)) // Set.add returns false if already exists
                .collect(Collectors.toList());
        System.out.println(duplicates);

        //Q5: Sort a list of strings by length, then alphabetically
        List<String> animals = Arrays.asList("Dog","Cat","Rhino","Giraffe","Lion","Ant","Duck");
        animals.sort(Comparator.comparing(String::length).thenComparing(String::valueOf));
        //The below one is said to be good practice as naturalOrder means sort it in natural order of Strings
        //But valueOf means convert it to strings and then use for compare which is not
        //required as the list is already of Strings
        animals.sort(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        System.out.println(animals);

        //Q6: Finding Average Salary Using Streams
        //Approach 1
        int totalEmployees = employees.size();
        double averageSalary = (double) (employees.stream().map(Employee::getSalary)
                .reduce(0, Integer::sum))/totalEmployees;
        System.out.println("Average Salary Using Approach 1:"+averageSalary);

        //Approach 2
        double avgSal = employees.stream()
                .mapToInt(Employee::getSalary)
                .average()
                .orElse(0);
        System.out.println("Average Salary Using Approach 2:"+avgSal);

    }
}

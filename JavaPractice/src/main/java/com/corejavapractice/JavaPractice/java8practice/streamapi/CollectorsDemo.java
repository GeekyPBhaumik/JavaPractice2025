package com.corejavapractice.JavaPractice.java8practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        //toList() and toSet()
        //Given a list of numbers [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], filter only odd numbers and collect into a new List.
        List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> listOddNum = listNum.stream().filter(x->x%2!=0).collect(Collectors.toList());
        System.out.println(listOddNum);

        //Given a list of numbers [1, 2, 2, 3, 3, 4, 5, 5], collect all unique numbers into a Set.
        List<Integer> duplicateNum = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);
        Set<Integer> uniqueNum = duplicateNum.stream().collect(Collectors.toSet());
        System.out.println(uniqueNum);

        //joining
        //Given a list of names ["Alice", "Bob", "Charlie"], join all names into a single string separated by " - ".
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        String joinedString = names.stream().collect(Collectors.joining(" - "));
        System.out.println(joinedString);

        //Given a list of names ["Alice", "Bob", "Charlie"], join all names with ", "
        // as delimiter and wrap the result with "Names: [" as prefix and "]" as suffix.
        String joinedStringWithPrefixSuffix = names.stream().collect(Collectors.joining(", ","[","]"));
        System.out.println(joinedStringWithPrefixSuffix);

        //Given a list of names ["Alice", "Bob", "Charlie", "Anna", "Brian"],
        //count how many names have more than 4 characters.
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "Brian");
        long count = students.stream().filter(x->x.length()>4).collect(Collectors.counting());
        System.out.println(count);

        //groupingBy()
        //Given a list of numbers [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
        // group them into even and odd — wait, use groupingBy() here,
        // not partitioningBy(). Group by the remainder when divided by 2 — so key 0 means even, key 1 means odd.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Integer,List<Integer>> map = numbers.stream().collect(Collectors.groupingBy(x->x%2));
        System.out.println(map);

        //Given a list of names ["Alice", "Bob", "Charlie", "Anna", "Brian", "Carol"],
        // group them by their first character.
        List<String> namesStudent = Arrays.asList("Alice", "Bob", "Charlie", "Anna", "Brian", "Carol");
        Map<Character,List<String>> mapByCharacter = namesStudent.stream()
                                    .collect(Collectors.groupingBy(x->x.charAt(0)));
        System.out.println(mapByCharacter);

        //Given the same list of names, group them by their length
        Map<Integer,List<String>> mapByLength = namesStudent.stream()
                                                .collect(Collectors.groupingBy(String::length));
        System.out.println(mapByLength);

        //groupingBy() with downstream
        //Given a list of names ["Alice", "Bob", "Charlie", "Anna", "Brian", "Carol"],
        //group by first character and also count how many names fall in each group.
        Map<Character,Long> countMap = namesStudent.stream()
                .collect(Collectors.groupingBy(x->x.charAt(0),Collectors.counting()));
        System.out.println(countMap);

        //Given the same list, group by length and find the count of names in each length group.
        Map<Integer, Long> countByLengthMap = namesStudent.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(countByLengthMap);

        //partitioningBy()
        //Given a list of numbers [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
        //partition into two groups — numbers greater than 5 and numbers less than or equal to 5.
        Map<Boolean,List<Integer>> partitionedMap = numbers.stream().collect(Collectors.partitioningBy(x->x>5));
        System.out.println(partitionedMap);

        //Given a list of names ["Alice", "Bob", "Charlie", "Anna", "Brian"],
        //partition into two groups — names longer than 4 characters and names with 4 or fewer characters.
        Map<Boolean,List<String>> lengthPartitionedMap = namesStudent.stream()
                                  .collect(Collectors.partitioningBy(x->x.length()>4));
        System.out.println(lengthPartitionedMap);

        //toMap()
        //Given a list of names ["Alice", "Bob", "Charlie"],
        //collect into a Map where the key is the name and value is the length of that name.
        List<String> newNames = Arrays.asList("Alice", "Bob", "Charlie");
        Map<String,Integer> nameMap = newNames.stream().collect(Collectors.toMap(x->x,x->x.length()));
        System.out.println(nameMap);

        //Given a list of numbers [1, 2, 3, 4, 5],
        //collect into a Map where the key is the number and value is its square.
        List<Integer> normalNums = Arrays.asList(1,2,3,4,5);
        Map<Integer,Integer> squareMap = normalNums.stream().collect(Collectors.toMap(x->x,x->x*x));
        System.out.println(squareMap);
    }
}

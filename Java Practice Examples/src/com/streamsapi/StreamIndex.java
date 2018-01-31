package com.streamsapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamIndex {
    public static void main(String args[]){
//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student("Vivek", 45));
//        students.add(new Student("Sohil", 100));
//
//        List<Integer> names = students.stream()
//                .map(Student::getRollNo)
//                .filter(xyz -> xyz == 45)
//                .collect(Collectors.toList());
//
//        System.out.println(names);

        List<Integer> numbers = Arrays.asList(5, 2, 1, 7, 4, 10);

        Spliterator<Integer> spliterator = numbers.spliterator();
        Spliterator<Integer> spliterator2 = spliterator.trySplit();

        System.out.println("after: ");
        spliterator.forEachRemaining(abc -> System.out.println(abc));
        System.out.println("2nd is: ");
        spliterator2.forEachRemaining(abc -> System.out.println(abc));

//        for(int x = 0; x < 20; x++){
//            spliterator.tryAdvance(abc -> System.out.println(abc));
//        }

        System.out.println(numbers.stream().map(Integer::intValue).filter(num -> num > 4).reduce(0, (a, b) -> a + b));
    }
}

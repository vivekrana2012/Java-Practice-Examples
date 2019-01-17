package com.fibonacciexample;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class Index {

    public static void main(String[] args){

        Stream.iterate(0, num -> num + 1).limit(10).forEach(System.out::println);

        int[] intArray = new int[]{0, 1};

        Arrays.stream(intArray).forEach(System.out::println);

        Stream.generate(new Random(10)::nextInt).limit(10).forEach(System.out::println);

    }
}

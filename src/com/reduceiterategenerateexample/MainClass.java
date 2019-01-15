package com.reduceiterategenerateexample;

import java.util.function.IntSupplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args){

        IntStream.rangeClosed(1, 10).reduce((a, b) -> a+b).ifPresent(System.out::println);

        int sum = IntStream.iterate(1, n -> ++n).limit(10).sum();

        System.out.println(sum);

        IntSupplier sup = new IntSupplier() {

            private int number = 0;

            @Override
            public int getAsInt() {
               return ++number;
            }
        };

        sum = IntStream.generate(sup).limit(10).sum();

        System.out.println(sum);
    }
}

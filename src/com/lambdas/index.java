package com.lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class index {

    public static void main(String[] args){
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        number.forEach(System.out::println);
    }
}

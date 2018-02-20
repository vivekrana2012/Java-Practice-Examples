package com.passbyreference;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(21);
        SomeClass someClass = new SomeClass();
        System.out.println("Before: "+someClass.getCount());

        increment(someClass);
        clean(list);

        System.out.println("After: "+someClass.getCount());
        System.out.println("After: "+list);
    }

    public static void increment(SomeClass someClass){
        someClass.increment();
    }
    public static void clean(ArrayList<Integer> list){
        list.clear();
    }
}

package com.multithreading;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Main {

    static final int THREADCOUNT = 2;
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        for(int itr = 3; itr < 10; itr++){
            set.add(itr);
        }

//        ThreadOperations to = new ThreadOperations(set, set.iterator());

        for(int itr = 0; itr < THREADCOUNT; itr++)
            new Thread(new PrimeThread("Thread"+itr, new ThreadOperations(set, set.iterator()))).start();
    }
}

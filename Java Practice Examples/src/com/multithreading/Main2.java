package com.multithreading;

<<<<<<< HEAD
public class Main {

    static final int THREADCOUNT = 4;
    static final int MAX_VALUE = 1000;
    public static void main(String[] args){
        int multiplier = MAX_VALUE/THREADCOUNT;
        for(int counter = 0; counter < THREADCOUNT; counter++){
            new Thread(new PrimeFinder(multiplier * counter, multiplier * (counter+1), "thread"+counter)).start();
        }
=======
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
>>>>>>> 7747e59dc9352790f1c9bf59e437da816f8f032e
    }
}

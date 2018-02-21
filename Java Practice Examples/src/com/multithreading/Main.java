package com.multithreading;

public class Main {

    static final int THREADCOUNT = 4;
    static final int MAX_VALUE = 1000;
    public static void main(String[] args){
        int multiplier = MAX_VALUE/THREADCOUNT;
        for(int counter = 0; counter < THREADCOUNT; counter++){
            new Thread(new PrimeFinder(multiplier * counter, multiplier * (counter+1), "thread"+counter)).start();
        }
    }
}

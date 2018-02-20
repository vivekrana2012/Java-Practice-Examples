package com.multithreading;

import java.util.*;

public class PrimeThread implements Runnable {

    String name;
    ThreadOperations to;

    public PrimeThread(String nameValue, ThreadOperations toValue){
        name = nameValue;
        to = toValue;
        //numberSet = Collections.synchronizedSet(numberSetValue);
    }

    @Override
    public void run() {
        int value = 0;
        while(true){
            value = to.popFromSet(name);
            if(value != 0)
                isPrime(value);
            else    break;
        }
    }

    public Boolean isPrime(int number){
        for(int counter = 2; counter <= number/2; counter++){
            if(number % counter == 0) {
                return false;
            }
        }
        System.out.println(number + " is prime and was found by "+name+".");
        return true;
    }
}

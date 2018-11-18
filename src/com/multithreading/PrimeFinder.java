package com.multithreading;

public class PrimeFinder implements Runnable {

    int start;
    int stop;
    String name;

    public PrimeFinder(int startValue, int stopValue, String nameValue){
        start = startValue;
        stop = stopValue;
        name = nameValue;
    }

    @Override
    public void run() {
        for(int counter = start; counter < stop; counter++){
            if(isPrime(counter)){
                System.out.println(counter +" is prime and was found by "+name);
            }
        }
    }

    public Boolean isPrime(int number){

        for(int counter = 2; counter <= number/2; counter++){
            if(number % counter == 0) {
                return false;
            }
        }
        return true;
    }
}

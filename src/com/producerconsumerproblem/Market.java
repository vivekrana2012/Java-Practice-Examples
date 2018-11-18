package com.producerconsumerproblem;

import java.util.LinkedList;

public class Market {

    LinkedList<Integer> queue = new LinkedList<>();
    int capacity = 2;

    public void produce() throws InterruptedException{
        int value = 0;

        while(true) {
            synchronized (this) {
                while(queue.size() == capacity){
                    wait();
                }
                System.out.println("Adding Job: "+value);
                queue.add(value++);
                notify();
                Thread.sleep(1000);
            }
        }
    }
    public void consume() throws InterruptedException{

        while(true){
           synchronized (this){
              while(queue.size() < 1){
                  wait();
              }
              int value = queue.removeFirst();
              System.out.println("Job removed: "+value);
              notify();
              Thread.sleep(1000);
           }
        }
    }
}

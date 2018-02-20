package com.multithreading;

import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;

public class ThreadOperations {
    HashSet<Integer> set;
    Iterator<Integer> itr;

    public ThreadOperations(HashSet<Integer> setValue, Iterator<Integer> itrValue){
        set = setValue;
        itr = itrValue;
    }

    public synchronized int popFromSet(String name){
        System.out.println(name + " is in sync code");
        int value = 0;
        try {
            if (itr.hasNext()) {
                value = itr.next();
                itr.remove();
            }
        }catch (ConcurrentModificationException ex){}
        System.out.println(name + " is leaving sync code");

        return value;
    }
}

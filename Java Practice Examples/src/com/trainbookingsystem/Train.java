package com.trainbookingsystem;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Train {

    LinkedHashSet<Integer> seats = new LinkedHashSet<Integer>();
    LinkedHashSet<Integer> coaches = new LinkedHashSet<Integer>();
    LinkedHashMap<Integer, LinkedHashSet<Integer>> capacity = new LinkedHashMap<Integer, LinkedHashSet<Integer>>();

    public Train(int coachesValue, int seatsValue){
        for(int itr = 0; itr < coachesValue; itr++) coaches.add(itr);

        for(int itr = 0; itr < seatsValue; itr++)   seats.add(itr);

        Iterator<Integer> iterator = coaches.iterator();
        while(iterator.hasNext()){
            capacity.put(iterator.next(), seats);
        }
    }

    public LinkedHashMap<Integer, LinkedHashSet<Integer>> getCapacity() {
        return capacity;
    }

    public LinkedHashSet<Integer> getCoaches() {
        return coaches;
    }
}

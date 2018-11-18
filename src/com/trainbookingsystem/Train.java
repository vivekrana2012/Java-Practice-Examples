package com.trainbookingsystem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Train {

    LinkedHashSet<Integer> seats = new LinkedHashSet<Integer>();
    LinkedHashSet<Integer> coaches = new LinkedHashSet<Integer>();
    HashMap<Integer, LinkedHashSet<Integer>> capacity = new HashMap<Integer, LinkedHashSet<Integer>>();
    Iterator<Integer> iterator;

    public Train(int coachesValue, int seatsValue){
        for(int itr = 0; itr < coachesValue; itr++) coaches.add(itr);

        for(int itr = 0; itr < seatsValue; itr++)   seats.add(itr);

        iterator = coaches.iterator();
        while(iterator.hasNext()){
            capacity.put(iterator.next(), seats);
        }
        iterator = coaches.iterator();
    }

    public synchronized Boolean sellTickets(){

        int coach = iterator.next();
        LinkedHashSet<Integer> seats = capacity.get(coach);

        if(seats.size() > 0){

        }

        return true;
    }

    public HashMap<Integer, LinkedHashSet<Integer>> getCapacity() {
        return capacity;
    }

    public LinkedHashSet<Integer> getCoaches() {
        return coaches;
    }
}

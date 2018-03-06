package com.searchandsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSortIndex {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 7, 4, 9, 5, 2, 6, 1));

        System.out.println(list);
        InsertionSort(list);
        System.out.println(list);
    }

    public static void InsertionSort(List<Integer> list){

        int greaterThan;
        int smallerThan;

        for(int counter = 0; counter < list.size(); counter++){

            greaterThan = 0;
            smallerThan = 0;

            for(int anotherCounter = counter; anotherCounter < 0; anotherCounter--){
                if(list.get(counter) < list.get(anotherCounter)){
                    greaterThan = anotherCounter;
                }else
                    smallerThan = anotherCounter;

                if(smallerThan == greaterThan-1){
                    list.add(greaterThan, list.get(anotherCounter));
                    list.remove(anotherCounter+1);
                    break;
                }
            }
        }
    }
}

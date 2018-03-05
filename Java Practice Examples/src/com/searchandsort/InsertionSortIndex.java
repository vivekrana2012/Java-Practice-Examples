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
        for(int counter = 0; counter < list.size(); counter++){
            for(int anotherCounter = counter; anotherCounter < 0; anotherCounter--){
                //if(list.get(anotherCounter) < ){}
            }
        }
    }
}

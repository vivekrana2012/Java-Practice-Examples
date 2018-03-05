package com.searchandsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSortIndex {

    public static void main(String[] args){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(3, 7, 4, 9, 5, 2, 6, 1));

        System.out.println(list);

        bubbleSort(list);

        System.out.println(list);
    }

    public static void bubbleSort(List<Integer> list){
        for(int counter = 0; counter < list.size(); counter++ ){
            for(int anotherCounter = 1; anotherCounter < list.size(); anotherCounter++){
                if(list.get(anotherCounter-1) > list.get(anotherCounter)){
                    int temp = list.get(anotherCounter);
                    list.set(anotherCounter, list.get(anotherCounter-1));
                    list.set(anotherCounter-1, temp);
                }
            }
        }
    }
}

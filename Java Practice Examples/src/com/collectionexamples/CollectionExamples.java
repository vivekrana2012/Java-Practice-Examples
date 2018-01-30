package com.collectionexamples;

import java.util.HashMap;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class CollectionExamples {

    public static void main(String args[]){
        HashMap scores = new HashMap();
        scores.put(null, "vivek");
        scores.put("vivek", "somevalue");
        scores.put("rahul", "somevalue");
        scores.put("bhawna", "somevalue");


        // hash code of vivek and null is same
        System.out.println("vivek".hashCode());
        System.out.println("rahul".hashCode());
        System.out.println(scores.get(null).hashCode());

        // all 3 have same hashcode
        System.out.println(scores.get("vivek").hashCode());
        System.out.println(scores.get("rahul").hashCode());
        System.out.println(scores.get("bhawna").hashCode());

        // System.out.println(scores);

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(6);
        myList.add(7);
        myList.add(15);
        Collections.sort(myList);
        System.out.println(myList);

        Collections.sort(myList, Collections.reverseOrder());

        System.out.println(myList);
    }
}

package com.collectionexamples;

import java.util.HashMap;

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

    }
}

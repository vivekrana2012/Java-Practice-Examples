package com.collectionexamples;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapExamples {

    public static void main(String[] args){
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("vivek", "me");
        hashmap.put("rahul", "brother");
        hashmap.put("nidhi", "sister");

        System.out.println(hashmap.keySet());

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>(16, 0.7f, true);
        linkedHashMap.put("vivek", "me");
        linkedHashMap.put("rahul", "brother");
        linkedHashMap.put("nidhi", "sister");

        linkedHashMap.hashCode();

        System.out.println(linkedHashMap.keySet());
        linkedHashMap.get("rahul");
        System.out.println(linkedHashMap.keySet());
        linkedHashMap.get("vivek");
        System.out.println(linkedHashMap.keySet());
    }
}

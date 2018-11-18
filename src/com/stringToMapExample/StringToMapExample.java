package com.stringToMapExample;

import java.util.ArrayList;

public class StringToMapExample {

    public static void main(String args[]){
        String first = "a,b";
        String second = "b,c";

        String str = "liability";

        ArrayList<String> cat = new ArrayList<>();
        cat.add(first);
        cat.add(second);

        System.out.println(str.contains("li"));
    }
}

package com.abstractexample;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class IndexClass {
    static {
        abc = 5;
    }
    private static int abc = 10;

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>(){
            {
                add(32);
            }
        };

        System.out.println(abc);
        System.out.println(list);

    }
}

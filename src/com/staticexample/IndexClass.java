package com.staticexample;

import java.util.ArrayList;

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

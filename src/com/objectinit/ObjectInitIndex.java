package com.objectinit;

public class ObjectInitIndex {

    private static int bar = 1;

    static{
        bar = 2;
    }

    public static void main(String args[]){
        ObjectInitIndex index = new ObjectInitIndex();
        System.out.println(index.bar);
    }
}

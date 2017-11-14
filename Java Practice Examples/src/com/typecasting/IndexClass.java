package com.typecasting;
import java.util.ArrayList;

public class IndexClass {

    public static void main(String args[]){

        ArrayList mylist = new ArrayList();
        mylist.add("Vivek");
        mylist.add(25);

        String name = (String) mylist.get(0);
        String age = (String) mylist.get(1); // throws ClassCastException - cannot convert from int to string

        BaseClass base = new ElderChild( (String)mylist.get(0), (int)mylist.get(1));
        // requires type casting
        ElderChild elderChild = (ElderChild) base;
        // base.age() not permitted
        base.getName();
    }
}

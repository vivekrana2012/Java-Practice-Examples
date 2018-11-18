package com.typecasting;
import java.util.ArrayList;

public class IndexClass {

    public static void main(String args[]){

        // typecasting double to long
        double number = 12.12;
        long otherNumber = (long)number;
        long someNumber = Math.round(number);
        long anotherNumber = new Double(number).longValue();
        // everything returns 12

        // operations in bytes with type conversions
        byte a = 12;
        byte b = 127;
        // a = a + b; not permitted
        a += b; // permitted

        // type casting int to array
        ArrayList mylist = new ArrayList();

        mylist.add("Vivek");
        mylist.add(25);

        String name = (String) mylist.get(0);
        // String age = (String) mylist.get(1); // throws ClassCastException - cannot convert from int to string

        BaseClass base = new ElderChild( (String)mylist.get(0), (int)mylist.get(1));
        // requires type casting
        ElderChild elderChild = (ElderChild) base;
        // base.age() not permitted
        base.getName();
    }
}

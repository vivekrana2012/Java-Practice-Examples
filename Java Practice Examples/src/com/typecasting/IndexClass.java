package com.typecasting;

public class IndexClass {

    public static void main(String args[]){
        ElderChild base = new ElderChild("Vivek", 25);
        // base.age() not permitted
        base.getName();
    }
}

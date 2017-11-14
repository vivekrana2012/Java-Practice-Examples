package com.typecasting;

public class ElderChild extends BaseClass {

    int age;

    public ElderChild(String name, int age){
        super(name);
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }
}

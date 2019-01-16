package com.defaultmethods;

public interface Mother {

    default void hairProperties(){
        System.out.println("brown and long");
    };
}

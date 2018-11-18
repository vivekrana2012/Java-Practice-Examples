package com.com.defaultmethods;

public interface Father {

    default void hairProperties(){
        System.out.println("black and short");
    };
}

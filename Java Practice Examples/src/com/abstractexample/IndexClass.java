package com.abstractexample;

public class IndexClass {

    public static void main(String args[]){
        AbstractClass abclass = new AbstractClass() {
            @Override
            void myFunction() {
                System.out.println("In the function");
            }
        };

        abclass.myFunction();
        abclass.myOtherFunction();
    }
}

package com.passbyreference;

public class SomeClass {

    private int count = 0;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increment(){
        this.count++;
    }
}

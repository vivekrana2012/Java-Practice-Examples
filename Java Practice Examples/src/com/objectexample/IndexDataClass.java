package com.objectexample;

public class IndexDataClass {

    int number1;
    int number2;

    public int getSum() {
        return number1+number2;
    }

    public void setNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    void someFunction(){
        setNumber(25,25);
    }

    public static void main(String args[]){
        IndexDataClass idc = new IndexDataClass();
        idc.someFunction();
        System.out.println(idc.getSum());
    }
}

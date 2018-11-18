package com.customArrayListImpl;

import java.util.Arrays;

public class MainClass {

  public static void main(String[] args){

    CustomArrayList arrayList = new CustomArrayList();

    for (int i = 0; i < 50; i++){
      arrayList.add(new Element().setName("Element "+i).build());
    }

    try{
      arrayList.remove(40);
    }catch (IndexException ex){
      System.out.println(ex.getMessage());
    }

    System.out.println("Size of queue is: "+arrayList.getSize()+" and it is having: "+arrayList.getNumberOfElements()+
        " elements.");

    Arrays.stream(arrayList.getArrayList()).filter(e -> e != null).map(e -> ((Element)e).getName()).forEach(System.out::println);
  }
}

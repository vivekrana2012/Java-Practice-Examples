package com.CustomQueueImpl;

import com.CustomArrayListImpl.Element;

import java.util.Arrays;

public class MainClass {

  public static void main(String[] args){

    Queue queue = new Queue(5);

    for(int i = 0; i < 10; i++){
      try {
        queue.addition(new Element().setName("Element "+i).build());
      }catch (QueueFullException ex){
        System.out.println(ex.getMessage());
      }
    }

    for (int i = 0; i < 10; i++){
      try{
        queue.remove();
      }catch(QueueEmptyException ex){
        System.out.println(ex.getMessage());
      }
    }

    System.out.println("Size of queue is: "+queue.getSize()+" and it is having: "+queue.getNumberOfElements()+
        " elements.");

    Arrays.stream(queue.getQueue()).filter(e -> e != null).map(e -> ((Element)e).getName()).forEach(System.out::println);

  }

}

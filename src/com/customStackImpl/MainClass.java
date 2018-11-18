package com.customStackImpl;

import java.util.Arrays;

public class MainClass {

  public static void main(String[] args){

    Stack stack = new Stack(16);

    for(int counter = 0; counter < 100; counter++){
      try {
        stack.push(new Element().setName("Element " + counter).build());
      }catch (StackFullException ex){
        System.out.println(ex.getMessage());
      }
    }

    for(int counter = 0; counter < 100; counter++){
      try {
        stack.pop();
      }catch (StackEmptyException ex){
        System.out.println(ex.getMessage());
      }
    }

    System.out.println("Size of stack is: "+stack.getSizeOfStack()+" and it is having: "+stack.getTop()+" elements.");

    Arrays.stream(stack.getStack()).filter(e -> e != null).map(e -> ((Element)e).getName()).forEach(System.out::println);
  }
}

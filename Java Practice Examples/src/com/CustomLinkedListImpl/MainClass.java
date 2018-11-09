package com.CustomLinkedListImpl;

import java.util.LinkedList;
import java.util.List;

public class MainClass {

  public static void main(String[] args){

    CustomLinkedList<Element> linkedList = new CustomLinkedList<>();
    for (int i = 0; i < 5; i++)
      linkedList.insertFirst(new Element().setName("Element "+i).build());

    linkedList.deleteFirst();

    Node<Element> node = linkedList.getFirst();

    while(node != null){
      System.out.println(node.getData().getName());

      node = node.getNextNode();
    }
  }
}

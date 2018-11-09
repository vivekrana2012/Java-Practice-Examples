package com.CustomLinkedListImpl;

public class CustomLinkedList<T> {
  private Node<T> first;

  public CustomLinkedList(){
    first = null;
  }

  public boolean insertFirst(T data){
    Node<T> node = new Node<>(data);
    node.setNextNode(first);
    this.first = node;
    return true;
  }

  public Node deleteFirst(){

    if(first == null)
      throw new ListEmptyException("No First node exists");

    Node removedNode = first;
    first = first.getNextNode();

    return removedNode;
  }

  public boolean add(Node<T> newNode){

    Node<T> node = getFirst();

    while(node != null){
      node = node.getNextNode();
    }

    node = newNode;

    return true;
  }

  public Node<T> getFirst() {
    return first;
  }
}

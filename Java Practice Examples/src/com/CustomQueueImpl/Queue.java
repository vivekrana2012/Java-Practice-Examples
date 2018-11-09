package com.CustomQueueImpl;

public class Queue {
  private int rear = -1;
  private int head = -1;
  private int size;
  private int numberOfElements = 0;
  private Object[] queue;

  public int getSize() {
    return this.size;
  }

  public int getNumberOfElements() {
    return this.numberOfElements;
  }

  public Object[] getQueue() {
    return this.queue;
  }

  public Queue(int size){
    this.size = size;
    this.queue = new Object[size];
  }

  public boolean addition(Object object){

    if(checkIfFull())
      throw new QueueFullException("Queue is Full.");

    if(head == size-1)
      head = 0;

    queue[++head] = object;
    numberOfElements++;

    return true;
  }

  public boolean remove(){

    if(checkIfEmpty()){
      throw new QueueEmptyException("Queue is Empty.");
    }

    if(rear == size)
      rear = -1;


    queue[++rear] = null;
    numberOfElements--;

    return true;
  }

  public boolean checkIfFull(){

    return numberOfElements >= size;
  }

  public boolean checkIfEmpty(){

    return numberOfElements <= 0;
  }

}

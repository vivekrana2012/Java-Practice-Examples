package com.CustomStackImpl;

public class Stack {

  private int sizeOfStack = 16;
  private int top = 0;
  private Object[] stack;

  public Stack(int size){
    this.sizeOfStack = size;
    stack = new Object[this.sizeOfStack];
  }

  public int getTop(){
    return this.top;
  }

  public int getSizeOfStack() {
    return this.sizeOfStack;
  }

  public Object[] getStack(){
    return this.stack;
  }

  public boolean push(Object object){

    if(checkIfFull()){
      throw new StackFullException("Stack is full. Please do a pop first.");
    }

    stack[top++] = object;

    return true;
  }

  public Object pop(){

    if(checkIfEmpty()){
      throw new StackEmptyException("Stack is Empty. Please push some stuff in first.");
    }

    Object temp = stack[top-1];
    stack[top--] = null;

    return temp;

  }

  public boolean checkIfFull(){
    return top >= sizeOfStack;
  }

  public boolean checkIfEmpty(){
    return top <= 0;
  }

}

package com.CustomArrayListImpl;

import java.util.Arrays;

public class CustomArrayList {
  private int size = 10;
  private int numberOfElements = 0;
  private int loadFactor = 1;
  private Object[] arrayList;

  public int getSize() {
    return size;
  }

  public int getNumberOfElements() {
    return numberOfElements;
  }

  public Object[] getArrayList() {
    return arrayList;
  }

  public CustomArrayList(){
    this.arrayList = new Object[size];
  }

  public CustomArrayList(int size, int loadFactor){
    this.size = size;
    this.loadFactor = loadFactor;
    this.arrayList = new Object[size];
  }

  public void add(Object object){
    if(checkIfFull())
      expand();

    arrayList[numberOfElements] = object;
    this.numberOfElements++;
  }

  public Object get(int index){

    if(index < numberOfElements)
      return arrayList[index];

    throw new IndexException("No Such Element Exists");
  }

  public boolean checkIfFull(){
    if(numberOfElements < (size*loadFactor))
      return false;

    return true;
  }

  public Object remove(int index){

    if(index >= numberOfElements)
      throw new IndexException("No Such Element Exists");

    Object removedElement = arrayList[index];

    for(int i = index; i < numberOfElements-1; i++){
      arrayList[i] = arrayList[i+1];
    }

    arrayList[numberOfElements-1] = null;

    numberOfElements--;

    return removedElement;
  }

  public void expand(){

    this.size *= 2;
    arrayList = Arrays.copyOf(arrayList, size);
  }
}

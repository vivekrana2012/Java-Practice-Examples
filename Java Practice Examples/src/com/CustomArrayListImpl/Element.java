package com.CustomArrayListImpl;

public class Element {

  private String name;

  public String getName() {
    return name;
  }

  public Element setName(String name) {
    this.name = name;
    return this;
  }

  public Element build(){
    return this;
  }
}

package com.stringexamples;

public class MainClass {

  public static void main(String[] args){

    String str = "tom and jerry are students.";

    boolean contains = str.matches("jerry");

    try {
      System.out.println("inside try");
      System.exit(0);
    } catch (Exception e) {
      System.out.println("Inside catch...");
    } finally {
      System.out.println("inside finally..");
    }

    System.exit(4);

    System.out.println(contains);
  }

}

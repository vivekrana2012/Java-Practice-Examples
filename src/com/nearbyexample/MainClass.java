package com.nearbyexample;

public class MainClass {

  public static void main(String[] args){

    String[] str = {"tom is a student", "jerry is a student", "tom and jerry are best friends"};

    String[] searchItems = {"tom jerry", "student", "best friends"};

    for(int counter = 0; counter < searchItems.length; counter++){
      String[] searchArray = searchItems[counter].split(" ");

      int length = str.length;

      for(int anotherCounter = 0; anotherCounter < length; anotherCounter++){

        int matchedCount = 0;

        for(int i = 0; i < searchArray.length; i++){

          if(str[anotherCounter].contains(searchArray[i])){
            matchedCount++;
          }

        }

        if(matchedCount == searchArray.length){
          System.out.println(searchItems[counter] + " is in string: " + str[anotherCounter]);
        }

      }

    }
  }
}

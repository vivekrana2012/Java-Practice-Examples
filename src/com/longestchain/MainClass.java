package com.longestchain;

import java.util.Arrays;

public class MainClass {

  public static void main(String[] args){

    int[] itemArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    int[] filledSlots = {4, 6, 7, 11};

    int start = 0;
    int end = itemArray.length;

    int[] slotLengths = {0, 0, 0, 0};

    for(int counter = 0; counter < filledSlots.length; counter++){

      if(counter == 0){
        slotLengths[counter] = filledSlots[counter] - start;
      }else if(counter == filledSlots.length - 1){
        slotLengths[counter] = end - filledSlots[counter];
      }else {
        slotLengths[counter] = filledSlots[counter] - filledSlots[counter - 1];
      }
    }

    Arrays.stream(slotLengths).forEach(System.out::println);

  }
}

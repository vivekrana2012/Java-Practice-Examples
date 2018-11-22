package com.longestchain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainClass {

  public static void main(String[] args){

    int[] itemArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    int[] filledSlots = {4, 6, 7, 11};

    int start = 0;
    int end = itemArray.length;

    List<Chain> listOfChains = new ArrayList<>(filledSlots.length * 2);

    for(int counter = 0; counter < filledSlots.length; counter++){

      if(counter == 0){
        listOfChains.add(new Chain(start, filledSlots[counter], filledSlots[counter] - start));
      }else if(counter == filledSlots.length - 1){
        listOfChains.add(new Chain(filledSlots[counter], end, end - filledSlots[counter]));
      }else {
        listOfChains.add(new Chain(filledSlots[counter - 1], filledSlots[counter], filledSlots[counter] - filledSlots[counter - 1]));
      }
    }

    int max = listOfChains.stream().mapToInt(Chain::getLength).max().getAsInt();

    Predicate<Chain> p = e -> max - e.getLength() < 2;

    listOfChains = listOfChains.stream().filter(p).sorted((o1, o2) -> o2.getLength() - o1.getLength()).collect(Collectors.toList());

    Function<Chain, Chain> function = e -> {

      boolean L1 = true;
      boolean L2 = true;
      boolean L3 = true;
      boolean L4 = true;

      if(e.getStartIndex() - 1 > start)
        L1 = Arrays.stream(filledSlots).anyMatch(filledSlot -> filledSlot == e.getStartIndex()-1);

      if(e.getStartIndex()-2 > start)
        L2 = Arrays.stream(filledSlots).anyMatch(filledSlot -> filledSlot == e.getStartIndex()-2);

      if(e.getEndIndex()+1 < end)
        L3 = Arrays.stream(filledSlots).anyMatch(filledSlot -> filledSlot == e.getEndIndex()+1);

      if(e.getEndIndex()+2 < end)
        L4 = Arrays.stream(filledSlots).anyMatch(filledSlot -> filledSlot == e.getEndIndex()+2);

      if(!L1 && !L2 || !L3 && !L4 || !L1 && !L3){
        e.setExpandedLength(e.getLength()+2);
      }else if(!L3 || !L4)
        e.setExpandedLength(e.getLength()+1);
      else
        e.setExpandedLength(e.getLength());
      return e;
    };

    listOfChains.stream().map(function).max(Comparator.comparing( Chain::getLength )).ifPresent(System.out::println);
  }
}

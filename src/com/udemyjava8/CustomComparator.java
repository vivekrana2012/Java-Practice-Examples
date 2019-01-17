package com.udemyjava8;

import java.util.Comparator;
import java.util.function.Function;

@FunctionalInterface
public interface CustomComparator<T> {

    int compare(T p1, T p2);

    default Comparator<T> thenComparing(Comparator<T> cmp){
        return (p1, p2) -> compare(p1, p2) == 0 ? cmp.compare(p1, p2) : compare(p1, p2);
    }

    default Comparator<T> thenComparing(Function<T, Comparable> f){
        return thenComparing(comparing(f));
    }

    static <T> Comparator<T> comparing(Function<T, Comparable> f){
        return (p1, p2) -> f.apply(p1).compareTo(f.apply(p2));
    }
}

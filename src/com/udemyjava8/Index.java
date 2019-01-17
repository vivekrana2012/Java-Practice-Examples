package com.udemyjava8;

import java.util.*;

public class Index {

    public static void main(String[] args){

        Person vivek = Person.of(26, "vivek", "rana");
        Person rahul = Person.of(33, "rahul", "rana");
        Person chris = Person.of(40, "chris", "stuckmann");
        Person jermy = Person.of(37, "jermy", "jahns");
        Person vivek2 = Person.of(31, "vivek", "kushwaha");

        List<Person> personList = new ArrayList(Arrays.asList(vivek, rahul, chris, jermy, vivek2));

        Comparator<Person> ageCmp = (p1, p2) -> p1.getAge() - p2.getAge();

        Collections.sort(personList, ageCmp);

        personList.stream().forEach(System.out::println);

        System.out.println("OR");

        Collections.sort(personList,
                CustomComparator.comparing(Person::getFirstName)
                        .thenComparing(Person::getAge));

        personList.stream().forEach(System.out::println);
    }
}

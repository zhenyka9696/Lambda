package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
    List<Person> persons = Arrays.asList(
            new Person("Jhon", "Doe"),
            new Person("Jake", "Duke"),
            new Person("Jhoe", "Doc")
    );
        /*Collections.sort(persons,new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
return  o1.getSurname().compareTo(o2.getSurname());
            }
        });*/
        persons.sort(Comparator.comparing(Person::getSurname));
        persons.forEach(System.out::println);
}
}

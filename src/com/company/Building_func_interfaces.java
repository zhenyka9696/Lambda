package com.company;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Building_func_interfaces {
    public static void main(String[] args) {
int n=2;
        Predicate<Integer> isPositive =i->i>0;
        System.out.println(isPositive.test(2));

        Predicate<Integer> isZero=i->i==0;
        System.out.println(isZero.test(n));

Predicate<Integer> isNegative=isPositive.or(isZero)
        .negate();
        System.out.println(isNegative.test((n)));
        //Функция
        Function <Person, String> getName=Person::getName;
        Person person=new Person("name","surname");
        System.out.println(getName.apply(person));
    Function<String,Character> firstChar= s->s.charAt(0);
        System.out.println(firstChar.apply("String"));

        //Поставщик
        Supplier<Person> supplier=Person::new;
        person=supplier.get();
        System.out.println(person.getName());

        //Потребитель
Consumer<Person> greeting=p-> System.out.println
        ("Hello, "+p.getName());
        person=new Person("name","surname");
        greeting.accept(person);

        //Сравниватель
Comparator<Person> comparator=(p1,p2)->
        p1.getName().compareTo(p2.getName());
Person person1=new Person("John","Doe");
Person person2=new Person("Alice","Krige");
        System.out.println(comparator.compare(person1,person2));
    }

    boolean isPositive(Integer i){
        if(i>0) return  true;
        else return false;

    }
}

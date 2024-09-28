package com.amol;

import java.util.function.Predicate;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static boolean isPersonEligible(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }
}

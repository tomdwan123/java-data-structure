package com.phucdevs;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMap {

    public static void main(String[] args) {

        maps1();

        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Tony"), new Diamond("Diamond Gold"));
        map.put(new Person("Jate"), new Diamond("Diamond Silver"));

        System.out.println(map.get( new Person("Tony") ));
    }

    private static void maps1() {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Ali"));
        map.put(3, new Person("Maria1"));
        map.put(3, new Person("Maria2"));
        map.put(4, null);
        map.put(null, new Person("null"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet()
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        map.forEach((key, value) -> {
            System.out.println(key + " " + value);
        });

        System.out.println( map.getOrDefault(5, new Person("default")) );
        System.out.println(map.values());
    }

    static class Person {

        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record Diamond(String name){}
}

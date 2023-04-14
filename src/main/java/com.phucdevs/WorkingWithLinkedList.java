package com.phucdevs;

import java.util.LinkedList;
import java.util.ListIterator;

public class WorkingWithLinkedList {

    public static void main(String[] args) {

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Alexa", 21));
        linkedList.addFirst(new Person("Ali", 21));
        linkedList.addLast(new Person("Alexb", 21));

        ListIterator<Person> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

    record Person(String name, Integer age){}
}

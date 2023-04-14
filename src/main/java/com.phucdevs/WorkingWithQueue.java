package com.phucdevs;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Tom", 20));
        queue.add(new Person("John", 25));
        queue.add(new Person("Marry", 30));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }

    record Person(String name, Integer age) {}
}

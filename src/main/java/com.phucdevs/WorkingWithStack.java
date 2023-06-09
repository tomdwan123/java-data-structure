package com.phucdevs;

import java.util.Stack;

public class WorkingWithStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek()); // 3
        System.out.println(stack.size()); // 3
        System.out.println(stack.pop()); // 3
        System.out.println(stack.size()); // 2
        System.out.println(stack.isEmpty()); // false
    }
}

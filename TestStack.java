package com.mobell;

import java.util.Stack;

/**
 * Created by prinm on 4/24/2017.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack();

        stack.push('A');
        System.out.println(stack);
        stack.push('B');
        System.out.println(stack);
        stack.push('9');
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.clear();
        System.out.println(stack);

    }
}

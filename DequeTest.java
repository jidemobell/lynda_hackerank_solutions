package com.mobell;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by prinm on 4/26/2017.
 */
public class DequeTest {
    public static void main(String[] args) {
        Deque deque = new LinkedList();

        deque.add("r");
        deque.add(2);
        deque.add("A");

        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());

    }
}

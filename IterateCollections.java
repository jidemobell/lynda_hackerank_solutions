package com.mobell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by prinm on 3/30/2017.
 */
public class IterateCollections {
    /*
    looping through
    a collection
     */

    public static void main(String[] args) {
        System.out.println("Ordered data");
        List<String> newlist = new ArrayList<>();
        newlist.add("California");
        newlist.add("oregon");
        newlist.add("Washington");

        System.out.println("Arraylist iterator");
        Iterator<String> iterator = newlist.iterator();

        while (iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }

        System.out.println("ArrayList each");
        for (String value:newlist
             ) {
            System.out.println(value);
        }

        System.out.println(" ");
        System.out.println("Java 8 method reference");

        newlist.forEach(System.out::println);









    }
}

package com.mobell;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by prinm on 3/30/2017.
 */
public class ArrayLists {

    public static void main(String[] args) {
        /*
        each item within a
        collection must be an instance of a class
        line Integer helper not int
         */

        /*
        collection objects like list and map
        can contain as many object as wanted
         */

        /*
        ArrayList is the implemented class
        or concrete implementation of the class
         */
        List<String> list = new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");
        list.add("Kentucky");
        list.add("Illinois");

        System.out.println(list);

        list.add("rome");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String myState = list.get(1);
        System.out.println(myState);

        int myStateIndex = list.indexOf("Oregon");

        System.out.println(myStateIndex);

    }

}

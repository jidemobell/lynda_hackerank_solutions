package com.mobell;

import java.util.HashSet;

/**
 * Created by prinm on 4/25/2017.
 */
public class HashSetting {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();


        hashSet2.add("jide"+" "+"rover");
        System.out.println(hashSet2.size());
        System.out.println(hashSet2);
        hashSet2.add("kunle"+" "+"ademi");
        System.out.println(hashSet2.size());
        System.out.println(hashSet2);
        hashSet2.add("jide"+" "+"rover");
        System.out.println(hashSet2);




    }
}

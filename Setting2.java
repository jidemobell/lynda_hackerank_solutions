package com.mobell;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by prinm on 4/25/2017.
 */
public class Setting2 {
    public static void main(String[] args) {
        Set wordSet = new HashSet();
        wordSet.add("john");
        wordSet.add("mary");

        System.out.println(wordSet);
        Set wordSet2 = new HashSet();
        wordSet2.add("john");
        wordSet2.add("tom");
        wordSet2.add("three");

        System.out.println(wordSet2.size());
    }
}

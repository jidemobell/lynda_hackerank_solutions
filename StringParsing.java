package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class StringParsing {
    public static void main(String[] args) {
        String s1 = "Welcome to California1";
        System.out.println("Length of string: "+ s1.length());

        int position = s1.indexOf("California");
        System.out.println("position is: "+ position);

        String s2 = "Welcome        ";
        System.out.println(s2 + "here");
        System.out.println(s2.trim()+ "here");

    }
}

package com.mobell;

import java.util.Arrays;

/**
 * Created by prinm on 4/2/2017.
 */
public class StringTokens {
    public static void main(String[] args) {

        String testcase = "He is a very very good boy, isn't he?";
        testcase = testcase.trim();

        if(testcase.isEmpty())return;

        String[] output = testcase.split("[!\\s,?._'@]+");

        System.out.println(output.length);
        for (String value :output
             ) {
            System.out.println(value);
        }

    }
}

package com.mobell;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by prinm on 4/2/2017.
 */
public class Palindrome {
    public static void main(String[] args) {
        String testCase = "avanava";

        /**
         * this solution uses midpoints and too long
         */



        if (testCase.length() % 2 == 0) {
            int midIndex = testCase.length() / 2;
            String firstHalf = testCase.substring(0, midIndex);
            String lastHalf = testCase.substring(midIndex,testCase.length());
            String reversed = new StringBuilder(lastHalf).reverse().toString();


            if (firstHalf.equalsIgnoreCase(reversed)) {
                System.out.println("Palindrome found");
            } else {
                System.out.println("not Palindrome");
            }

        }else{
            System.out.println("odddy!!!");
            int midIndex = (testCase.length() - 1)/2;
            String firstHalf = testCase.substring(0, midIndex+1);
            String lastHalf = testCase.substring(midIndex, testCase.length());
            String reversed = new StringBuilder(lastHalf).reverse().toString();
            if (firstHalf.equalsIgnoreCase(reversed)) {
                System.out.println("Palindrome found");
            } else {
                System.out.println("not Palindrome");
            }

        }

    }

}

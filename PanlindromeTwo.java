package com.mobell;

/**
 * Created by prinm on 4/2/2017.
 */
public class PanlindromeTwo {

    public static void main(String[] args) {
        String testcase = "cilac";
        String reversed = new StringBuilder(testcase).reverse().toString();

        if (reversed.equalsIgnoreCase(testcase)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

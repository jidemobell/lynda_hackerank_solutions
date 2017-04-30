package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class ErrorsExceptions {
    public static void main(String[] args) {
        String s= null;
        System.out.println(s);

        String welcome ="welcome";
        char[] chars = welcome.toCharArray();
        char lastChar = chars[chars.length-1];
        System.out.println(lastChar);

    }
}

package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class Stringing {
    public static void main(String[] args) {
        String s1 = "this is sting one";
        String s2 = new String("this is two");

        char[] chars = {'H','e','l','l','o'};
        System.out.println(s1 + s2);
        String s3 = new String(chars);
        System.out.println(s3);
        System.out.println(s1+" "+s2+" "+s3);
    }

}

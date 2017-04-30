package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 4/1/2017.
 */
public class Substrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

      //  Substrings substrings = new Substrings();
        String newWord = S.substring(start,end);

        System.out.println(newWord);

    }
}

package com.mobell;

import sun.plugin.javascript.navig.Array;

import java.io.*;
import java.util.*;

import java.util.Scanner;

/**
 * Created by prinm on 4/1/2017.
 */
public class LexicoOrder {
    public static void main(String[] args) {

        String testcase = "welcometojava";
        int k = 3;
        List<String> cutList = new ArrayList<>();


//        System.out.println(testcase.substring(3,6));

        for (int i = 0; i < testcase.length()-1 ; i=i+1) {
            String cutString = testcase.substring(i,i+k);
            System.out.println(cutString);
            cutList.add(cutString);


            if (i+k == testcase.length() )break;
        }
        Collections.sort(cutList);
        System.out.println(cutList);
        System.out.println(cutList.get(0));
        System.out.println(cutList.get(cutList.size()-1));



//        String cut = testcase.substring(1,4);
//        System.out.println(cut);
//        System.out.println(testcase);

//






    }
}

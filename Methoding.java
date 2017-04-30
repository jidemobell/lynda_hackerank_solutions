package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class Methoding {

   static String[] months = {
            "January","February",
            "March", "April",
            "June","July",
            "August","September",
            "October","November",
            "December"

    };
    public static void main(String[] args) {
        loopIt("Months of the year");
    }

    /*
    static method so it can
    be called from a static main
    method
     */
    static void loopIt(String label){
        System.out.println(label);
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i <months.length ; i++) {
            System.out.println(months[i]);
        }
        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");
        }
    }
}

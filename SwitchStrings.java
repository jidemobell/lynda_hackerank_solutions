package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 3/29/2017.
 */
public class SwitchStrings {
    public static void main(String[] args) {
        /*
        examine a single value
        compare it to multiple
        possibilities
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = sc.nextLine();


        /*
        starting with java 7
        switch now works with string
         */

        switch (input){
            case "jan":
                System.out.println("The month is 1");
                break;
            case "Feb":
                System.out.println("The month is 2");
                break;
            case "March":
                System.out.println("The month is 3");
                break;
            default:
                System.out.println("You chose another month");
        }

    }
}

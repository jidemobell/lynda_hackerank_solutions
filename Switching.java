package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 3/29/2017.
 */
public class Switching {
    public static void main(String[] args) {
        /*
        examine a single value
        compare it to multiple
        possibilities
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        String input = sc.nextLine();
        int monthNumber = Integer.parseInt(input);

        switch (monthNumber){
            case 1:
                System.out.println("The month is january");
                break;
            case 2:
                System.out.println("The month is February");
                break;
            case 3:
                System.out.println("The month is March");
                break;
            default:
                System.out.println("You chose another month");
        }

    }
}

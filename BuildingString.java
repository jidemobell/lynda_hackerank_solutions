package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 3/29/2017.
 */
public class BuildingString {
    /*
    doing lots of concatenation
    with lots of string objects
    is not recommended for memory
    instead use string builder
     */

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(", ");
        stringBuilder.append("World");
        stringBuilder.append("!");

        System.out.println(stringBuilder);

        StringBuilder newBuilder = new StringBuilder("Hello")
                     .append(", ")
                     .append("World")
                     .append("!");
        System.out.println(newBuilder);

        /*
        using stringbuilder to put
        user inputs together
        collect data that the user provide

         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter anything: ");
        String input = scanner.nextLine();
        System.out.println("You said " +input);

        /*
        nextline wait for the user
        to input a value and press enter
         */

        stringBuilder.delete(0, stringBuilder.length());
        for (int i = 0; i < 3 ; i++) {
            input = scanner.nextLine();
            stringBuilder.append(input + "\n");
        }
        System.out.println(stringBuilder);

    }

}

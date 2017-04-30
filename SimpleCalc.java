package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 3/29/2017.
 */
public class SimpleCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numeric value: ");
        String firstInput = input.nextLine();
        System.out.println("Enter a numerical value: ");
        String secondInput = input.nextLine();

        float sumInputs = (Integer.parseInt(firstInput) + Float.parseFloat(secondInput));

        System.out.println("The answer is :" + sumInputs);




    }
}

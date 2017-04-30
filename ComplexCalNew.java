package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 3/30/2017.
 */
public class ComplexCalNew {

    public static void main(String[] args) {
        double first = 0;
        double second = 0;

        try {
            String firstInput = collectInputs("Enter a numeric value");
            String secondInput = collectInputs("Enter a numeric value");

            first = Double.parseDouble(firstInput);
            second = Double.parseDouble(secondInput);

            String op = collectInputs("chose an operator");

            switch (op) {
                case "+":
                    double result= addValues(first, second);
                    System.out.println("The answer is "+ result);
                    break;
                case "/":
                    divideValues(first, second);
                    break;
                case "*":
                    multiplyValues(first, second);
                    break;
                case "%":
                    subtractValues(first, second);
                    break;
                case "-":
                    moduloValues(first, second);
                    break;
                default:
                    throw (new Exception("Unrecognized Operand"));

            }
        }catch (NumberFormatException e){
            System.out.println("You entered a non numeric value");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
    static String collectInputs(String prompt){
        System.out.print(prompt);
        Scanner in = new Scanner(System.in);
        return  in.nextLine();
    }

    static double addValues(double s1, double s2){
        return s1+s2;
    }
    static double subtractValues (double s1, double s2){
        return s1 - s2;
    }
    static double divideValues (double s1, double s2){
        return s1/s2;
    }
    static double moduloValues (double s1, double s2){
        return s1%s2;
    }
    static double multiplyValues (double s1, double s2){
        return s1*s2;
    }








}

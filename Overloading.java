package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 3/30/2017.
 */
public class Overloading {
    public static void main(String[] args) {
        String s1 = getInput("Enter Value 1");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result1 = addValues(s1,s2);
        System.out.println("The answer is "+ result1);
        double result2 = addValues(s1,s2,s3);
        System.out.println("The answer to second is 2 " + result2);

        double result3 = addValues(s1,s2,s3,s1,s2,s3);
        System.out.println("The answer for many  " + result3);
    }

    static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /*
    though we have two methods
    add values
    the are distinguished
    bu their varying number of inputs
     */

    static double addValues(String s1, String s2){
        double d1= Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }
    static double addValues(String s1, String s2,String s3){
        double f1= Double.parseDouble(s1);
        double f2 = Double.parseDouble(s2);
        double f3 = Double.parseDouble(s3);
        double output = f1 + f2+ f3;
        return output;
    }
    static double addValues(String ... values){
        double result = 0;
        for (String value: values){
            double d = Double.parseDouble(value);
            result += d;
        }
        return result;
    }
}

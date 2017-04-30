package com.mobell;

import com.sun.org.apache.xpath.internal.operations.Bool;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

/**
 * Created by prinm on 3/30/2017.
 */
public class ComplexCalc {
    public static void main(String[] args) {
        operatorUnit();

    }


    static void operatorUnit (){

        String firstInput = null;
        String secondInput = null;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a numeric value: ");
            firstInput = sc.nextLine();
            System.out.println("Enter a numeric value: ");
            secondInput = sc.nextLine();

            double first = Double.parseDouble(firstInput);
            double second = Double.parseDouble(secondInput);

            System.out.println("Choose an operation");
            String operAta = sc.nextLine();


            switch (operAta){
                case "+":
                    double result = Double.parseDouble(firstInput) + Double.parseDouble(secondInput);
                    System.out.println("The answer is: "+ result);
                    break;
                case "/":
                    double result2 = Double.parseDouble(firstInput) / Double.parseDouble(secondInput);
                    System.out.println("The answer is: "+ result2);
                    break;
                case "*":
                    double result3 = Double.parseDouble(firstInput) * Double.parseDouble(secondInput);
                    System.out.println("The answer is: "+ result3);
                    break;
                case "%":
                    double result4 = Double.parseDouble(firstInput) % Double.parseDouble(secondInput);
                    System.out.println("The answer is: "+ result4);
                    break;
                default:
                    throw (new Exception("Unrecognized operand"));




            } }catch (NumberFormatException e) {
            System.out.println("Error:A non numeric value was entered");
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }


    }


}

package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class IfStatements {
    public static void main(String[] args) {
        int monthNumber = 8;

        if (monthNumber>= 1 && monthNumber<= 3){
            System.out.println("you're in a Quater 1");
        }else if (monthNumber>= 4 && monthNumber<= 6){
            System.out.println("You're in Quatre 2");
        }else if (monthNumber>= 7 && monthNumber<= 9){
            System.out.println("You're in Quatre 3");
        }else if (monthNumber>= 10 && monthNumber<= 12){
            System.out.println("You're in Quatre 2");
        }else{
            System.out.println("That's an unknown month");
        }

        /*
        if it's a single condition
        block
        you dont need the braces with the if
        that if its a single statement
         */
    }
}

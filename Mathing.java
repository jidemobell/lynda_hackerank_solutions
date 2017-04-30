package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class Mathing {
    public static void main(String[] args) {
        int intValue1 = 56;
       int  intValue2 = 56;

       double doubleVaule = 3.999999d;
       long rounded = Math.round(doubleVaule);
        /*

        the maths method are static
        means you dont need to create an instance
        object of math to call e.g the round method

        */
        System.out.println(rounded);

    }
}

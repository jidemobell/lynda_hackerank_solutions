package com.mobell;

/**
 * Created by prinm on 4/29/2017.
 */
public class NumberFun {
     static long findNextSquare(long sq) {
        double result = Math.sqrt(sq);
        if (result - (int)result == 0.0){
            long next=  (((long) Math.sqrt(sq))+1);
            return next * next;
        }else {
            return -1;
        }
    }

    public static void main(String[] args) {
       System.out.println(findNextSquare(1));
       System.out.println(Math.sqrt(0));

    }
}

package com.mobell;

/**
 * Created by prinm on 4/9/2017.
 */
public class RecursiveFactorial {
    public static long factorial(int n){
        if(n==1)return 1;

        return n*factorial(n-1);
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}

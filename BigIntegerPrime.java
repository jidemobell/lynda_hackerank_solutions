package com.mobell;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by prinm on 4/5/2017.
 */
public class BigIntegerPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    //    String input = scanner.nextLine();
        BigInteger bigInteger = scanner.nextBigInteger();
        scanner.close();

        /*
        BigInteger bigInteger = new BigInteger(input); */
        if (bigInteger.isProbablePrime(1)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }


    }
}

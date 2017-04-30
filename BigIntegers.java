package com.mobell;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by prinm on 4/5/2017.
 */
public class BigIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();

//        String firstStringValue = Integer.toString(firstInput);
//        String secondStringValue = Integer.toString(secondInput);

        BigInteger firstBig = new BigInteger(firstInput);
        BigInteger secondBig = new BigInteger(secondInput);

        System.out.println(firstBig.add(secondBig));
        System.out.println(firstBig.multiply(secondBig));










        BigIntegers bigIntegers = new BigIntegers();// new BigIntegers(firstStringValue);



    }
}

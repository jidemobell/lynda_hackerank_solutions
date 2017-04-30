package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class CurrencyNumbers {
    public static void main(String[] args) {
        int intValue1 = 56;
        int intValue2 = intValue1;

        System.out.println("The second valeu is "+ intValue1);

        long longVaule1 = intValue1;                            //widening the type
        System.out.println("The long value is "+ longVaule1);

        short shortValue1 = (short) intValue1;            //narrowing the type - cast
        System.out.println("The short value is "+ shortValue1);

        int intValue3 = 1024;
        byte byteValue = (byte) intValue3;

        System.out.println("the byte value is "+ byteValue);


    }
}

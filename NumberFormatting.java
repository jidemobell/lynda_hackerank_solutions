package com.mobell;

import java.text.NumberFormat;
import java.util.Locale;
import java.text.DecimalFormat;

/**
 * Created by prinm on 3/29/2017.
 */
public class NumberFormatting {
    public static void main(String[] args) {
        Locale locale = new Locale("da","DK");
        Locale locale2 = new Locale ("en","NI");
        double doubleValue=1_234_567.89;

        NumberFormat numF = NumberFormat.getNumberInstance(locale);
        System.out.println("Number "+ numF.format(doubleValue));


        NumberFormat currF = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency "+ currF.format(doubleValue));

    }
}

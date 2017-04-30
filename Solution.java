package com.mobell;

import java.math.BigDecimal;

/**
 * Created by prinm on 3/27/2017.
 */
public class Solution {

    public static void main(String[] args) {
        double value = .012;

        System.out.println(value +value + value);

        String strValue = Double.toString(value);

        System.out.println(strValue);

        BigDecimal bigValue = new BigDecimal(strValue);//new BigDecimal(strValue);

        System.out.println(bigValue.add(bigValue).add(bigValue));
    }
}

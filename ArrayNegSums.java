package com.mobell;

/**
 * Created by prinm on 4/6/2017.
 */
public class ArrayNegSums {
    public static void main(String[] args) {
        int[] testCase = {1,-2,4,-5,1};
        int count = 0;
        for (int i = 0; i < testCase.length ; i++) {
            int sum=0;
            for (int j = i; j <testCase.length ; j++) {
                sum = sum + testCase[j];
                if (sum <0){
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

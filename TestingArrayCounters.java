package com.mobell;

/**
 * Created by prinm on 4/6/2017.
 */
public class TestingArrayCounters {
    public static void main(String[] args) {
        int[] testCase = {1,-2,4,5,1};
        int sum = 0;
        for (int i = 0; i < 1 ; i++) {
            for (int j = i; j <testCase.length ; j++) {
                sum = sum + testCase[j];
                System.out.println(sum);
                /**
                 * This shows the countinous sums
                 * of the contgous subarrays
                 * only when i = 1
                 * just to test if our code works
                 */
            }
        }
    }
}

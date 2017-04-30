package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 4/6/2017.
 */
public class ArrayNegSumTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        int count = 0;
        int[] array = new int[n];
        while(i<n){
            array[i]=in.nextInt();
            i++;
        }

        for (int j = 0; j < array.length ; j++) {
            int sum=0;
            for (int k = j; k <array.length ; k++) {
                sum = sum + array[k];
                if (sum <0){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}

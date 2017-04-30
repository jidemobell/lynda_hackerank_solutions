package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 4/12/2017.
 */

public class ArrayGameTwo {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int testCases = stdin.nextInt();

        for (int i = 0; i < testCases ; i++) {
            int arrayIndex = stdin.nextInt();
            int jumpSteps = stdin.nextInt();

            int[] array = new int[arrayIndex];
            for (int j = 0; j < arrayIndex; j++) {
                array[j] = stdin.nextInt();
            }
            System.out.println(array.length);
            for (int entry: array
                    ) {
                System.out.println(entry);
            }
            for (int k=0;k<array.length; k++) {
                if (k==0){
                    if (array[k+1]!=0){

                    }
                }
            }

        }



    }



}

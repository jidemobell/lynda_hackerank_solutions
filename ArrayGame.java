package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 4/8/2017.
 */
public class ArrayGame {

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
                if(array[k] == 0){
                    if(array.length-1 == k){
                        System.out.println("YES");
                        break;
                    }
                    else if(array.length-1 >k && jumpSteps == 0 ){
                        System.out.println("NO");
                        break;
                    }
                    else if(array.length-1 > k && jumpSteps > 0){
                    }
                }
                else if(array[k] == 1){
                    jumpSteps--;
                    if (array.length-1 == k && jumpSteps >= 0){
                        System.out.println("YES");
                        break;
                    }
                    else if(array.length-1 > k && jumpSteps == 0){
                        System.out.println("NO");
                        break;
                    }
                }
            }

        }

    }
}

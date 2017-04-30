package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 4/5/2017.
 */
public class ArrayFromInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] intArray = new int[n];

        for (int i = 0; i <n ; i++) {
            int valueInput = scanner.nextInt();
            intArray[i]=valueInput;
        }
        for (int entry:intArray
             ) {
            System.out.println(entry);
        }
    }
}

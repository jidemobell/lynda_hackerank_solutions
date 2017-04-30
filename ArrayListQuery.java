package com.mobell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by prinm on 4/6/2017.
 */
public class ArrayListQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int[] intArray = new int[5];
        //here we generate an array of type Arraylist
        ArrayList[] firstArray = new ArrayList[rows];
        for (int i = 0; i < rows; i++) {
            int rowSizeIndex = sc.nextInt();
            firstArray[i]=new ArrayList();   //array index i is an arraylist and implemented thus
            for (int j = 0; j < rowSizeIndex ; j++) {
                int rowEntry = sc.nextInt();
                firstArray[i].add(rowEntry);
            }
        }

        int queryRows = sc.nextInt();
        for (int i = 0; i < queryRows; i++) {
            int queryRow = sc.nextInt();
            int queryColumn = sc.nextInt();

            try {
                System.out.println(firstArray[queryRow-1].get(queryColumn-1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");;
            }
        }


        
    }
}

package com.mobell;

import java.util.Arrays;

/**
 * Created by prinm on 3/30/2017.
 */
public class SimpleArrays {
    public static void main(String[] args) {
        System.out.println("Array of primitives");
        int[] ints = {9,6,3};
    //    Arrays.sort(ints);


        System.out.println("Setting an initial size");
        int[] sized = new int[5];
        for (int i = 0; i < sized.length; i++) {
            sized[i]=i*100;
            System.out.println(sized[i]);
        }
        System.out.println("Copying an Array");
        int[] copied = new int[5];
        System.arraycopy(sized, 0,copied,0,5);


    }
}

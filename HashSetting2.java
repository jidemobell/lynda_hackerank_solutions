package com.mobell;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by prinm on 4/25/2017.
 */
public class HashSetting2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < t; i++) {
            pair_left[i]=s.next();
            pair_right[i]=s.next();
            hashSet.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(hashSet.size());
        }

    }
}

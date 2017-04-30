package com.mobell;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by prinm on 4/5/2017.
 */
public class ReOrderArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String[] s=new String[n+2];

        for (int i = 0; i <n; i++) {
            s[i]=sc.next();
        }sc.close();

        Arrays.sort(s,0,n,(entry1,entry2) ->
                {
                    return new BigDecimal(entry2).compareTo(new BigDecimal(entry1));
                }
        );



        System.out.println(s.length);

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);

        }
    }
}

package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 4/1/2017.
 */
public class Alphabetical {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int sum = A.length() + B.length();
        System.out.println(sum);

        int compare = A.compareTo(B);

        if(compare < 0){
            System.out.println("No");
        }else if (compare == 0){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

        String output1 = A.substring(0,1).toUpperCase()
                + A.substring(1).toLowerCase();
        String output2 = B.substring(0,1).toUpperCase()
                + B.substring(1).toLowerCase();
        System.out.println(output1 +" "+output2);





    }
}

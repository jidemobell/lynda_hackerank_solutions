package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class StringCompare {
    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "hello";

        if(str1 == str2){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match");
        }

        String part1 = "hello";
        String part2 = "World";
        String str4 = part1+ part2;
        String str5 ="HelloWorld";

        /*
        to ge a accurate result
        when comparing string use
        the equals and equals ignore
         */
        if(str4.equalsIgnoreCase(str5)){
            System.out.println("They match!");
        }else{
            System.out.println("They don't match");
        }
    }
}

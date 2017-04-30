package com.mobell;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by prinm on 4/4/2017.
 */
public class TagContentExtractor {
    public static void main(String[] args) {

/*
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String regex = "<(.+)>(.[^<>]+)</\\1>";  //[<](\w+)[>]\s*(\w+)\s*[<][/]\1[>]
            boolean f = true;                                                            //[<](\w+)[>]\s*([^<>]+)\s*[<][/]\1[>]
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            if(line.length()<=1000){
                if(matcher.find() && matcher.group(2).length()<=1000000){
                    System.out.println(matcher.group(2));
                }else{
                    System.out.println("None");
                }
            }

            testCases--;
        } */

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            String regex = "<(.+)>([^<]+)</\\1>";
            boolean f = false;
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(line);

            if(line.length()<=10000){
                while(matcher.find() && matcher.group(2).length()<=1000000){
                    System.out.println(matcher.group(2));
                    f=true;
                }if(!f){
                    System.out.println("None");
                }
            }
            testCases--;
        }

    }
}

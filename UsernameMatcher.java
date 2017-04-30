package com.mobell;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by prinm on 4/4/2017.
 */
public class UsernameMatcher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numberCases = Integer.parseInt(scanner.nextLine());

        String regex = "^[a-zA-Z]\\w{7,29}$"; //"[^\\w]\\w+\\_*";
        Pattern pattern = Pattern.compile(regex);

        while (numberCases-- >0){
            String prompt = scanner.nextLine();
            Matcher matcher = pattern.matcher(prompt);

            if (matcher.find()){
                System.out.println("Valid");
            }else {
                System.out.println("Invalid");
            }
        }
        scanner.close();


    }
}

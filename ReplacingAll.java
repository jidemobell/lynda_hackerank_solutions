package com.mobell;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by prinm on 4/4/2017.
 */
public class ReplacingAll {

    public static void main(String[] args) {

        String regex = "(?i)(\\b\\w+\\b)\\b(\\s+\\1)\\b";   // (?i)(\b\w+\b)\s+\1
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE); //compile(regex, /* Insert the correct Pattern flag here.*/);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(regex,"$1");//replaceAll(/* The regex to replace */, /* The replacement. */);
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}

package com.mobell;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by prinm on 4/2/2017.
 */
public class PatternCompile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases > 0) {
            String prompt = scanner.next();
            try {
                Pattern.compile(prompt);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

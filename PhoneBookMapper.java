package com.mobell;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by prinm on 4/20/2017.
 */
public class PhoneBookMapper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            try {
                if (phoneBook.get(s)== null) {
                    throw (new Exception("Not Found"));
                } else{
                    System.out.println(phoneBook.get(s));}
           } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

package com.mobell;

import java.util.Scanner;

/**
 * Created by prinm on 4/2/2017.
 */
public class IpValidator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String Ip=in.next();
            System.out.println(Ip.matches(new Checker().pattern));
        }
    }

    static class Checker{
        final String pattern ="^([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\." +
                "([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\.([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])\\\\." +
                "([01]?\\\\d\\\\d?|2[0-4]\\\\d|25[0-5])$";

        Checker(){}
    }
}

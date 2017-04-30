package com.mobell;

/**
 * Created by prinm on 4/2/2017.
 */
public class MyRegex {

    public static void main(String[] args) {

        MyRegex myRegex = new MyRegex();
        String check = "";

        Getter getter = new Getter();

        String ip = "121.234.12.12";
        if (ip.matches(getter.pattern)){
            System.out.println("good");
        }else{
            System.out.println("it doesn't");
        }

    }

    static class Getter {
        final String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])" +
                "\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        Getter(){}

    }


}



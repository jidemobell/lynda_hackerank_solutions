package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */


public class bools {

    //here we declare a variable outside main as a membe
    //of the class
    static boolean bDef;

    public static void main(String[] args) {
        boolean b1= true;
        boolean b2 = false;
        boolean c; //gave me error bcause i need to initialize it in main

        System.out.printf("The value of B1 is "+ b1 +"\n");
        System.out.printf("The value of B2 is "+ b2 + "\n");
        System.out.printf("The value of c is "+ bDef + "\n");

        int i1 = 0;
        boolean b4 =(i1 != 0);
        System.out.println("the value of b4 "+ b4);

        String sBoolean = "true";
        Boolean parsed = Boolean.parseBoolean(sBoolean);
        System.out.println("The value of me boolean "+parsed);

    }
}

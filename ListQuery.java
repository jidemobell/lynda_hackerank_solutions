package com.mobell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by prinm on 4/20/2017.
 */
public class ListQuery {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.println("Enter index range: ");
        Integer N = stdin.nextInt();
        List<Integer> myList = new ArrayList();
        System.out.println("Polpulate the List: ");
        for (int i = 0; i < N; i++) {
            myList.add(stdin.nextInt());
        }
        System.out.println("Enter Query and input: ");
        Integer Q = stdin.nextInt();
        System.out.println("Enter query input: ");
        int i = 0;
        while (i < Q) {
            String input = stdin.next();

            switch (input){
                case "insert":
                    Integer x = stdin.nextInt();
                    Integer y = stdin.nextInt();
                    try {
                        myList.set(x,y);
                    } catch (IndexOutOfBoundsException e) {
                        myList.add(y);
                    }
                    myPrint(myList);
                    break;
                case "delete":
                    Integer newX = stdin.nextInt();
                    myList.remove(myList.get(newX));
                    myPrint(myList);
                    break;
            }
            i++;
        }
    }

    static void myPrint(List<Integer> myList){
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i)+ " ");
        }
    }
}

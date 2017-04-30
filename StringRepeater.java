package com.mobell;

/**
 * Created by prinm on 4/29/2017.
 */
public class StringRepeater {

    public static void main(String[] args) {

        System.out.println(repeatStr(5,"Hello"));
    }

    static StringBuilder repeatStr(int j, String text){
        StringBuilder stringBuilder = new StringBuilder();
        while(j >0){
            stringBuilder.append(text);
            j--;
        }
        return stringBuilder;
    }
}

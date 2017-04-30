package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class TryCatch {
    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars =  welcome.toCharArray();

        try {
            char lastChar = chars[chars.length-1];
            System.out.println(lastChar);
            String sub = welcome.substring(10);

        } catch (ArrayIndexOutOfBoundsException e) {
    //        e.printStackTrace();
            System.out.println("Array index problem");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String index Error");

        }
    }
}

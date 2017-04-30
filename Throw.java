package com.mobell;

/**
 * Created by prinm on 3/29/2017.
 */
public class Throw {
    public static void main(String[] args) {

        String welcome = "Welcome!";
        char[] chars = welcome.toCharArray();

        try {
            if (chars.length < 10){
                throw (new Exception("my custom message"));
            }
            char lastChar = chars[chars.length-1];
            System.out.println(lastChar);

            String sub = welcome.substring(10);
            System.out.println("Substring: " +sub);
        } catch (ArrayIndexOutOfBoundsException e) {
       //     e.printStackTrace();
            System.out.println("Array index error");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("String index error!");
        } catch (Exception e) {
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

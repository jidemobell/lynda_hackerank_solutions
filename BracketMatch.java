package com.mobell;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by prinm on 4/24/2017.
 */
public class BracketMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack();
        System.out.println(stack);
        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            for (int i = 0; i < input.length() ; i++) {
                char symbol = input.toCharArray()[i];
                System.out.println(symbol);
                if(symbol == '{' || symbol == '[' || symbol== '('){
                    stack.push(symbol);
                }
                if(symbol == '}'){
                    if(!stack.isEmpty()&& stack.peek().equals('{')) {
                    stack.pop();     // pop last value which is '{'
                    }
                }
                if(symbol == ']'){
                    if(!stack.isEmpty()&& stack.peek().equals('[')) {
                        stack.pop();     // pop last value which is '{'
                    }
                }
                if(symbol == ')'){
                    if(!stack.isEmpty()&& stack.peek().equals('(')) {
                        stack.pop();     // pop last value which is '{'
                    }
                }
            }

            if (stack.isEmpty()){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
            stack.clear();
        }
        sc.close();
    }
}

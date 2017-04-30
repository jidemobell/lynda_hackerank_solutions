package com.mobell;

import java.util.*;

/**
 * Created by prinm on 4/25/2017.
 */
public class Setting {
    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);
        int times = stdin.nextInt();
        List<Set> setList = new ArrayList<>();

      int i=0;
      int count = 1;
      while (i<times){
          Set wordSet = new HashSet();
          wordSet.add(stdin.next());
          wordSet.add(stdin.next());
          if (!(setList.contains(wordSet))){
              setList.add(wordSet);
              System.out.println(count++);
          }else{
              System.out.println(count-1);
          }
          i++;
      }

    }
}

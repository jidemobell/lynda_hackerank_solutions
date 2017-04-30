package com.mobell;

/**
 * Created by prinm on 3/30/2017.
 */
public class MultiArrays {


    public static void main(String[] args) {
        String[][] states = new String[3][2];

        /*
outer array has 3 items
each item has 2 sub-items
 */
      states[0][0]="California";
      states[0][1]="Sacramento";
      states[1][0]="Oregon";
      states[1][1]="Salem";
      states[2][0]="Washington";
      states[2][1]="Olympio";

        for (int i = 0; i < states.length ; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The Capital Of ")
                    .append(states[i][0])
                    .append("is")
                    .append(states[i][1])
                    .append(".");

            System.out.println(sb);
        }

    }
}



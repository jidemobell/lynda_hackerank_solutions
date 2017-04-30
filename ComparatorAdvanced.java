package com.mobell;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by prinm on 4/26/2017.
 */
public class ComparatorAdvanced {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i]= new Player(scan.next(),scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (int i = 0; i < player.length; i++) {
            System.out.printf("%s %s \n", player[i].name, player[i].score);
        }
    }

}

class Checker implements Comparator<Player>{

    public int compare (Player o1, Player o2){

        if(o1.score != o2.score){
           return  o2.score - o1.score;
           // return  compare(o1, o2);
        }else {
            return o1.name.compareTo(o2.name);
        }

    }
}

class Player {
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

package com.mobell;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by prinm on 3/30/2017.
 */
public class HarshMapping {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();



        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        map.put("Alaska","Juneau");
        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println(cap);

        map.remove("California");
        System.out.println(map);


    }
}

package com.mobell;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by prinm on 3/30/2017.
 */
public class IterateMapCollections {

    public static void main(String[] args) {
        Map<String , String> newMap = new HashMap<>();
        newMap.put("Lagos","ikeja");
        newMap.put("Oyo","Ibadan");
        newMap.put("Akure","Ondo");

        System.out.println(newMap);
        System.out.println("");

        System.out.println("Hashmap Iterator");
        Set<String> keys = newMap.keySet();
        Iterator<String> iterator = keys.iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            System.out.println("The capital of "+ key +" is " + newMap.get(key));
        }

        System.out.println("");
        System.out.println("HashMap foreach");
        for (String key:keys
             ) {
            System.out.println(key + " is the state of " + newMap.get(key) );
        }





    }

}

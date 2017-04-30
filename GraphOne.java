package com.mobell;


import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by prinm on 4/12/2017.
 */
public class GraphOne {
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();


    public static class Node {
        private  int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id){
            this.id=id;
        }
    }





}


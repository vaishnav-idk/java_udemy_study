package dev.lpa;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //LinkedList<String> places=new LinkedList<>();
        var places=new LinkedList<String>();


    }

    public static void addMoreElements(LinkedList<String> list)
    {
        list.add("A");
        list.addLast("B");
        list.offerLast("C");
        list.push("hello");
    }
}
package dev.lpa;

import java.util.ArrayList;

record GroceryItem(String name, String type ,int count) {
    public GroceryItem(String name){
        this(name,"DAiry",1);
    }
}
public class Main {
    public static void main(String[] args) {
        Object[] groceryItems = new GroceryItem[3];
        groceryItems[0] = new GroceryItem ("milk");
        groceryItems[1] = new GroceryItem ("apples","produce",6);
        groceryItems[2] = new GroceryItem ("helo");

        ArrayList<GroceryItem> glist = new ArrayList<>();
        glist.add(new GroceryItem ("butter"));

    }
}

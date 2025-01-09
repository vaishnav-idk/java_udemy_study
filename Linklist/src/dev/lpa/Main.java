package dev.lpa;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance){
    public String toString(){
        return String.format("%s (%d) ", name, distance);
    }
}
public class Main {
    public static void main(String[] args) {
        //LinkedList<String> places=new LinkedList<>();
        var places=new LinkedList<Place>();
    Place adeladide = new Place("adeladide", 1374);
    addMoreElements(places,adeladide);

    addMoreElements(places,new Place("Adeladide", 1374));
    addMoreElements(places,new Place("Belgium", 2375));
    addMoreElements(places,new Place("Austria", 2475));
    addMoreElements(places,new Place("France", 575));
    addMoreElements(places,new Place("Sydney", 0));
        System.out.println(places);
        var iterator = places.listIterator();
        Scanner sc=new Scanner(System.in);
        boolean quitLoop=false;
        boolean forward=true;
        printMenu();
        while(!quitLoop){
            System.out.print("Enter an option: ");
            String menuItem=sc.nextLine().toUpperCase().substring(0,1);
            switch(menuItem){
                case "F":
                    System.out.print("Go forward");
                    break;
                case "B":
                    System.out.print("Go back");
                    break;
                case "M":
                    printMenu();
                    break;
                case "L":
                    System.out.print(places);
                    break;
                default :
                    quitLoop=true;
                    break;
            }
        }

    }

    public static void addMoreElements(LinkedList<Place> list,Place place)
    {
        if(list.contains(place))
        // if two records have the same field values java finds that both records are equal
        {
            System.out.println("Already exists"+place);
            return;
        }

        for(Place p:list){
            if(p.name().equalsIgnoreCase(place.name())){
                System.out.println("Already exists"+place);
                return;
            }
        }
        int matchedIndex=0;
        for(var listPlace:list){
            if(place.distance()<listPlace.distance()){
                list.add(matchedIndex,place);
                return;
            }
            matchedIndex++;
            //adds smallest distance to first
            /*this works because LinkedList types is
            doubly ended linkedlist in java wont work
            with ArrayList
             */
        }

           list.add(place);

    }

    public static void printMenu(){
       System.out.println("""
               Available actions (select word or letter):
               (F)orward
               (B)ackwards
               (L)ist Places
               (M)enu
               (Q)uit""");
    }
}
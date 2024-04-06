package com.company;
import java.util.*;
public class Cwh_Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> l3 = new ArrayList<>(15);
        l2.add(34);
        l2.add(90);
        l2.add(85);


        l1.add(7);
        l1.add(5);
        l1.add(1);
        l1.add(3);
        l1.add(7);
        l1.add(0,5);
        l1.add(0,2); // add the element in the given index
        l1.addAll(l2); // add all the element of l2 in l1
        System.out.println(l1.contains(2));
//        System.out.println(l1.clone());  // create a shallow copy of the arraylist(it copy the reference of the element)
//        System.out.println(l1.indexOf(7)); // return the first occurring index of the given element
//        System.out.println(l1.lastIndexOf(7)); // return the last index of the given element
//        l1.set(1,365); // set the new element in the given index
       // System.out.println(l1.retainAll(l2)); // return the common element in both the arraylists
        System.out.println(l1.subList(0,3)); // print the element from the given indexes

        System.out.println(l1);
//        for (int i = 0; i < l1.size(); i++) {
//            System.out.println(l1.get(i));
//        }
    }
}

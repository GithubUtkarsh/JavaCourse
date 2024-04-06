package com.company;

import java.util.*;

public class LinkedList_Cwh {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        LinkedList<Integer> l3 = new LinkedList<>();

        l2.add(34);
        l2.add(90);
        l2.add(85);


        l1.add(7);
        l1.add(5);
        l1.add(1);
        l1.add(3);
        l1.add(7);
        l1.add(0,5);
        l1.add(0,2);
        l1.addAll(l2);
        l1.addLast(325);
        l1.addFirst(500);

        System.out.println(l1.contains(2));
//        System.out.println(l1.clone());
//        System.out.println(l1.indexOf(7));
//        System.out.println(l1.lastIndexOf(7));
//        l1.set(1,365);
//         System.out.println(l1.retainAll(l2));
        System.out.println(l1.subList(0,3));
        System.out.println(l1);
    }
}

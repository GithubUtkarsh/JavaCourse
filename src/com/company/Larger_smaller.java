package com.company;
import java.util.Scanner;

public class Larger_smaller {
    public static void main(String[] args) {
        int num[] = new int[10];
        int i , small ,large;
        System.out.println("Enter 10 numbers");
        Scanner sc = new Scanner(System.in);
        for (i=0;i<10;i++){
            num[i] = sc.nextInt();
        }
        large = num[0];
        small = num[0];
        for(i=0;i<10;i++){
            if (num[i]>large){
                large = num[i];
            }
            if (num[i]<small){
                small = num[i];
            }
        }
        System.out.println("The largest number is :" + large);
        System.out.println("The smallest number is :" + small);

    }

}

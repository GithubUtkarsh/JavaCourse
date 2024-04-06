package com.company;

import java.util.Scanner;

public class NestedExceptionHandling {
    public static void main(String[] args) {
        int[] marks = {32,12,76};
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while(flag) {
            System.out.println("Enter the index of the array: ");
            int index = sc.nextInt();
            try {
                try {
                    System.out.println(marks[index]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException error) {
                    System.out.println("Sorry! This index doesn't exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception error) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thank you for using this program");
    }
}

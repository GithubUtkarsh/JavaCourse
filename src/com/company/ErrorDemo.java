package com.company;
import java.util.Scanner;

public class ErrorDemo {
    public static void main(String[] args) {
        // SYNTAX ERROR DEMO
        // int a = 8 // Error: no semicolon!
        // b = 10 // Error: b is not declared!s

        // LOGICAL ERROR DEMO
        // Write a program to print all prime number from 1 to 10
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }

        // RUNTIME ERROR
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is: " + 1000/k);

    }
}

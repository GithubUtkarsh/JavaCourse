package com.company;
import java.util.Scanner;


public class Exercsie_1 {
    public static void main(String[] args) {
        System.out.println("Enter the marks of five subjects: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of English :");
        float a = sc.nextFloat();

        System.out.println("Enter the marks of Hindi :");
        float b = sc.nextFloat();

        System.out.println("Enter the marks of Science :");
        float c = sc.nextFloat();

        System.out.println("Enter the marks of Maths :");
        float d = sc.nextFloat();

        System.out.println("Enter the marks of Social Science :");
        float e = sc.nextFloat();

        float percentage = (a+b+c+d+e) / 5;
        System.out.println("Your Percentage is " +  percentage + "%");

    }
}

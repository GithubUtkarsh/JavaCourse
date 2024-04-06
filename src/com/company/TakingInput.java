package com.company;
import java.sql.SQLOutput;
import java.util.Scanner; // Importing  the Scanner class


public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from users");
        Scanner  sc = new Scanner(System.in);    //Creating an object named "sc" of the Scanner class.
//        System.out.println("Enter number 1");
//        int a = sc.nextInt();        // (Method to read from the keyboard)
//        float a = sc.nextFloat();
//        System.out.println("Enter number 2");
//        int b = sc.nextInt();
//        float b = sc.nextFloat();

//        int sum = a+b;
//        float sum = a+b;
//        System.out.println("The sum of these number is");
//        System.out.println(sum);
//        boolean b1 = sc.hasNextInt();
//        System.out.println(b1);
//        String str = sc.next();
        String str = sc.nextLine();
        System.out.println(str);
    }
}

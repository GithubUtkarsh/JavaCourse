package com.company;
import java.util.Scanner;
class MaxTryException extends Exception{
    public String toString(){
        return "Max Try Reached!";
    }
}

public class Ch14_PracticeSet_ErrorHandling {
    public static void main(String[] args) {
        // Problem 1
        // Syntax Error --> int a = 5
        // Logical Error
        //int age = 87;
        //int year = 2000 - 87;
        //System.out.println(55 / 0); // Runtime Error

        // Problem 2
        try{
            //int a = 666/0; // For Arithmetic Exception
//            int age = -1;
//            if(age < 0){
//                throw new IllegalArgumentException();
//            }

        }
        catch (IllegalArgumentException e){
            System.out.println("Hehehe");
        }
        catch (ArithmeticException e){
            System.out.println("Hahaha");
        }

        // Problem 3
//        boolean flag = true;
//        int[] marks = {23,43,76};
//        Scanner sc = new Scanner(System.in);
//        int index;
//        int i = 0;
//        while(flag && i < 5){
//            try {
//                System.out.println("Enter the index");
//                index = sc.nextInt();
//                System.out.println("The value of marks[index] is " + marks[index]);
//                break;
//            }
//            catch(Exception e){
//                System.out.println("Invalid index");
//                i++;
//            }
//        }
//        if(i >= 5){
           // System.out.println("Error");
            // Problem 4
//            try{
//                throw new MaxTryException();
//            }
//            catch (MaxTryException e){
//                System.out.println(e);
//            }
//        }
        try {
            MaxRetry();
        } catch (MaxTryException e) {
            System.out.println(e.toString());
        }
    }
    // Problem 5
    static void MaxRetry()throws MaxTryException{
        boolean flag = true;
        int[] marks = {23,43,76};
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int index;
        while(flag && i < 5){
            try {
                System.out.println("Enter the index");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
    }
}

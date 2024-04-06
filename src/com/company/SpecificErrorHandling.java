package com.company;
import java.util.Scanner;

public class SpecificErrorHandling {
    public static void main(String[] args) {
        int[] arr = {12,56,44,32,76};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array index: ");
        int index = sc.nextInt();

        System.out.println("Enter the number you want to divide with: ");
        int number = sc.nextInt();

        try{
            System.out.println("The value of array index entered is: " + arr[index]);
            System.out.println("The value of array - value/number is: " + arr[index]/number);
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception occurs!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBound Exception occurs!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some Exception occurs!");
            System.out.println(e);
        }
    }
}

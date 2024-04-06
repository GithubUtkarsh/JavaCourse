package com.company;

public class ErrorHandling {
    public static void main(String[] args) {

        int a = 6000;
        int b = 0;

        // Without Try
        //int c = a / b;
        //System.out.println("The result is:" + c);

        // With Try
        try{
            int c = a / b;
            System.out.println("The result is:" + c);
        }
        catch (Exception error){
            System.out.println("We have failed to execute Because:");
            System.out.println(error);
        }
        System.out.println("End of the Program!");
    }
}

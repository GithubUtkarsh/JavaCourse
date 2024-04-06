package com.company;

import com.sun.security.jgss.GSSUtil;

public class PS_for_loops {
    public static void main(String[] args) {
//        Problem 1
//        int n = 0;
//        for (int i= 4 ; i>n ; i--)
//        {
//            for(int j = 0; j<i ;j++){
//                System.out.print("*");
//
//            }
//            System.out.print("\n");
//        }
//        Problem 2
//        int n=4 ,i = 0;
//        int sum=0;
//        while (i<n){
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println("The sum of first n even number is: " + sum);

//        Problem 3
//        int n = 5;
//        for (int i = 1;i<= 10;i++){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//            System.out.println(n +" X "+ i + " = " + n*i);
//
//        }

//        Problem 4
//        int n = 10;
//        for (int i = 10; i>=1 ;i--){
//            System.out.println(n +" X "+ i + " = " + n*i);
//        }

//        Problem 5
//        int n = 5;
//        int factorial = 1;
//        for (int i = 1 ; i <= n  ;i++){
//            factorial = factorial * i;
//
//        }
//        System.out.println("Factorial of " + n + " is : " + factorial);

//        Problem 6
//          int n = 5;
//          int factorial = 1;
//          int i = 1;
//          while (i<=n){
//              factorial *=i;
//              i++;
//
//          }
//        System.out.println("Factorial of " + n + " is : " + factorial);

//        Problem 7

//        int i =5;
//        while (i > 0){
//            int j = 0;
//            while (j < i){
//                System.out.print("*" );
//                j++;
//            }
//            System.out.print("\n");
//            i--;
//        }

//        Problem 9

//        int n =8;
//        int sum = 0;
//        for (int i = 1;i <= 10;i++){
//            System.out.printf("%d X %d = %d\n ",n,i,n*i);
//            sum = sum + n*i;
//        }
//        System.out.println("The sum is : " + sum);

//        Problem 11
//        int sum = 0,n = 4;
//        for (int i = 0 ; i<n;i++){
//            sum = sum + (2*i);
//        }
//        System.out.println("The sum is : " + sum);

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

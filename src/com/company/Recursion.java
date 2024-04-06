package com.company;

public class Recursion {
    static int factorial(int a){
        if(a==0 || a==1){
            return 1;
        }
        else{
            return a = a * factorial(a-1);
        }
    }

        static int factorial_iterative(int a){
            if(a==0 || a==1){
                return 1;
            }
            else{
                int sum = 1;
                for (int i = 1;i<=a;i++){
                    sum *= i;
                }
                return sum;
            }
        }

        static int fibonacci(int x){
            int a = 0,b = 1;
            System.out.print(a + " "+ b);
            for(int i = 0;i<=x;i++){
                int c = a+b;
                System.out.print(" "+ c);
                a=b;
                b=c;
            }
                return 0;
        }




    public static void main(String[] args) {
        int x = 5;
//        System.out.println("The factorial series of n is:  " + factorial(x));
//        System.out.println("The factorial series of n is:  " + factorial_iterative(x));
        System.out.println("The fibonacci series of "+ x +" is:");
          fibonacci(x);


    }
}

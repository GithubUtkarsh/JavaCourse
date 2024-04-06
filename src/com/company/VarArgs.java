package com.company;

public class VarArgs {
//    static int sum(int ...arr) {
//        int result = 0;
//        for (int a : arr) {
//            result += a;
//        }
//        return result;
//    }


    static int sum(int x,int ...arr) {
        int result = x;
        for (int a : arr) {
            result += a;
        }
        return result;
    }




    public static void main(String[] args) {
        System.out.println("The sum of 1,2 and 3 is: "+ sum(1,2,3));
        System.out.println("The sum of 1 and 3 is: "+ sum(1,3));
        System.out.println("The sum of 1,2,5and 3 is: "+ sum(1,2,3,5));
//      System.out.println("The sum of Nothing is: "+ sum());   -> This will throw an error because it required at least one argument to run this function
        System.out.println("The sum of 1,2,5and 3 is: "+ sum(1));

        }
    }


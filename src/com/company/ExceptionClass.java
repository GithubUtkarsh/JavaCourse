package com.company;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "I am toStirng() ";
    }
    public String getMessage(){
        return "I am getMessage()";
    }
}
class MyException1 extends Exception{
    @Override
    public String toString(){
        return "Age cannot be greater than 125 ";
    }
    @Override
    public String getMessage(){
        return "Make sure that the value you entered is correct";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a < 20){
            try{
//                throw new MyException();
                throw new ArithmeticException("This is an exception");
            }
            catch(Exception error){
                System.out.println(error.toString());
                System.out.println(error.getMessage());
               // System.out.println(error);
                error.printStackTrace();
                System.out.println("Finished!");
            }
            System.out.println("Yes Finished!");
        }
    }
}

package com.company;

public class FinallyKeyword {
    public static int greet(){
        try{
            int a = 50;
            int b = 2;
            int c = a / b;
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
           // code in finally block will run every time and if you not use catch after try it will handle it
            System.out.println("Cleaning up resources ......This is the end of the function");
        }
        return -1;
    }

    public static void main(String[] args) {
//        greet();
//        System.out.println(greet());
        int a = 9;
        int b = 3;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally");
            }
            b--;
        }
        try{
            System.out.println(50/0 );
        }
        finally{
            System.out.println("Yes this is finally ");
        }
    }
}

package com.company;

public class Methods_Overloading {
    static void foo(){
        System.out.println("Hello bro!");
    }
    static void foo(int a){
        System.out.println("Hello bro! "  + a);
    }
    static void foo(int a, int b){
        System.out.println("Hello bro!" + a  +" or " + b);
    }






    static void change(int a){
        a = 24;
    }
    static void change2(int [] ary){
        ary[0]= 66;
    }
    static void joke(){
        System.out.println("I invented a new word!\n" +
                "Plagiarism!");
    }

    public static void main(String[] args) {

//        Case 1 : Changing the integer
//        int a = 22;
//        change(a);
//        System.out.println("The value of a after change method is called : "+a);

//        Case 2 : Changing the Array

//        int [] arr = {54,34,24,42,77};
//        change2(arr);
//        System.out.println("The value of arr after change2 method is called " + arr[0]);

//        joke();
        foo();
        foo(1000);
        foo(2000,3000);

    }
}

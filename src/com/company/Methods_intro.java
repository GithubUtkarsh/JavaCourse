package com.company;

import com.sun.security.jgss.GSSUtil;

public class Methods_intro {
    static int logic(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*5;
        }
        x = 34234;
        return z;
    }
    public static void main(String[] args) {
            int a = 5;
            int b = 6;
            int c;
        // Method invocation using Object creation
        //Methods_intro obj = new Methods_intro();
        //c = obj.logic(a,b);
            c=logic(a,b);
            System.out.println(a+ " " + b);
            System.out.println(c);
            int a1 =2;
            int b1 = 1;
            int c1;
            c1 = logic(a1, b1);
            System.out.println(c1);

    }
}

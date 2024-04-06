package com.company;

public class Methods_PS {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n){
        for (int i = 0;i<n;i++){
            for (int j = 0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int sumRec(int n){
        if (n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }

    static void pattern2(int n){
        for (int i = n;i>0;i--){
            for (int j = i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    static float avg(float ...arg){
        float result = 0;
        float len = arg.length;
        for(float a: arg){
            result = (result) + a;
        }
        return result/len;
    }

    static void pattern2_rec(int n){
        if (n>0){
            for (int i = n;i>0;i--){
                System.out.print("*");
            }
            System.out.println();
            pattern2_rec(n-1);

        }
    }

    static void pattern1_rec(int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i =0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();


        }
    }

    static float c_to_f(float n){
        System.out.println("_______Celsius to Fahrenheit Converter______");
//        System.out.println("Enter temperature in celsius:");
        float c = n;
         c = (c*9/5) + 32;
        System.out.println(c+"°F");

        return c;
    }

    static int sum_iter(int n){
        int result = 0;
        for (int i = 1;i<=n;i++){
            result = result+i;
        }
        return result;
    }


    public static void main(String[] args) {

//        Problem 1
//        multiplication(5);

//        Problem 2
//        pattern1(4);

//        Problem 3
//        int c = sumRec(4);
//        System.out.println(c);

//        Problem 4
//        pattern2(4);

//        Problem 5
//        fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//        int result =fib(5);
//        System.out.println(result);

//        Problem 6
//        float a= avg(1,2,3,4);
//        System.out.println(a);

//        Problem 7
//        pattern2_rec(4);

//        Problem 8
//        pattern1_rec(4);

//        Problem 9
//         c_to_f(6);

//        Problem 10
//        System.out.println(sum_iter(4));


    }
}

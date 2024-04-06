package com.company;
import java.util.Scanner;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

public class Array_Ps {
    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
//        Question 1
//
//
//        float [] sum = {80.5f,59.0f,54.3f,90.5f,65.5f};
//        float total = 0;
//        for (int i = 0;i<sum.length;i++){
//            total = total + sum[i];
//
//        }
//         for(float elememt:sum ){
//             total = total + elememt;
//         }
//
//
//        System.out.println("The sum of this array is: "+ total);

//        Question 2

//        float marks [] = {80.5f,59.0f,54.3f,90.5f,65.5f};
//        float num = 80.5f;
//        boolean isInArray = false;
//
//        for (float element:marks){
//            if(num==element){
//                isInArray = true;
//                break;
//            }
//        }
//
//        if(isInArray){
//            System.out.println("The value is present in the array");
//        }
//        else{
//
//            System.out.println("The value is not present in the array");
//        }

//        Question 3

//        float [] marks = {80.5f,59.0f,54.3f,90.5f,65.5f};
//        float sum = 0;
//
//        for (float i:marks){
//            sum = sum + i;
//        }
//        System.out.println("The average marks is "+ sum/marks.length);

//        Question 4

//        int [][] mat1 ={{1,2,3},{4,5,6}};
//        int [][] mat2 ={{2,3,14},{1,8,9}};
//        int [][] result = {{0,0,0},{0,0,0}};
//
//        for (int i = 0 ; i< mat1.length ;i++){
//            for(int j = 0;j<mat1[i].length;j++){
//                result[i][j]=mat1[i][j]+mat2[i][j];
//            }
//
//        }
//
//        for(int i = 0;i< mat1.length;i++){
//            for(int j = 0; j< mat1[i].length;j++){
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }

//        Question 5
//
//        int [] arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for(int i = 0; i<n;i++){
//            // Swap a[i] and a[l-1-i]
//            // a   b   temp
//            // |4| |3| ||
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        for (int element :
//                arr) {
//            System.out.print(element + " ");
//        }

//        Question 6

//        int [] arr = {1,22,332,2321,44,8,90};
//        int max = Integer.MIN_VALUE;
//
//        for(int e:arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("The value of the maximum element in this array is: " +max);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

//        Question 7
//
//        int [] arr= {10,3,32,44,32,9,2};
//        int min = arr[0];
//        int min = Integer.MAX_VALUE;
//
//        for (int i:arr){
//            if(i<min){
//                min = i;
//            }
//        }
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println("The value of minimum element in this array is:" + min);

//        Question 8

//        boolean isSorted = true;
//        int [] arr={1,2,3,4,5,34,66};
//        for(int i = 0;i<arr.length-1;i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("The array is sorted");
//
//        }
//        else {
//            System.out.println("The array is not sorted");
//        }

//        Fibonacci Series

//        int a=0,b=1,input=4,c;
//        System.out.print(a+" " + b+" ");
//        for (int i = 1; i<=input;i++){
//
//            c=a+b;
//            System.out.print(c+ " ");
//            a=b;
//            b=c;
//        }

//   Panildrome number

//       int input = 123;
//       int x=input;
//
//       int rev=0;
//       while(input>0){
//            rev = (rev*10)+input%10;
//           input=input/10;
//
//       }
//        if(x==rev){
//            System.out.println("The number is panildrome");
//        }
//        else {
//            System.out.println("The number is not panildrome");
//        }

//        Panildrome string

//        System.out.println("Enter the string");
//        String str = sc.next();
////        String str = "madam";
//        int l = str.length();
//        String rev = "";
//
//        for (int i=l-1;i>=0;i--){
//            rev = rev + str.charAt(i);
//
//        }
//        if(str.equals(rev)){
//            System.out.println("This is panildrome string");
//        }
//        else{
//            System.out.println("This is not panildrome string");
//        }

        


    }

}

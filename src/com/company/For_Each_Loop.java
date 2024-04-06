package com.company;

public class For_Each_Loop {
    public static void main(String[] args) {
        /*
        float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        String [] students ={"Harry", "Rohan", "Shubham", "Lovish"};
        System.out.println(students.length);
        System.out.println(students[2]);
        */

        int [] marks = {67,88,90,34,82};
//        System.out.println(marks.length);

        System.out.println("Printing using Naive ways");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        System.out.println("Printing using for loop");

        for(int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

//        Quick Quiz
        System.out.println("Printing using for loop in reverse order");
        for (int i = marks.length -1 ; i>=0;i--){
            System.out.println(marks[i]);
        }


//        Quick Quiz - Printing array using for-each loop
        System.out.println("Printing using for-each loop");
        for(int j : marks){
            System.out.println(j);
        }

    }
}

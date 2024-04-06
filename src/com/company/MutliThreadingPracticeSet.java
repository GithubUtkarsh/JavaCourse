package com.company;

class PracticeSet1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 1000){
            System.out.println("Good Morning!");
            i++;
        }
    }
}

class PracticeSet2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 1000){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
            System.out.println("Welcome!");
            i++;
        }
    }
}
public class MutliThreadingPracticeSet {
    public static void main(String[] args) {
        PracticeSet1 p1 = new PracticeSet1();
        PracticeSet2 p2 = new PracticeSet2();

        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());

//        p1.start();
        p2.start();
        System.out.println(p2.getState());
    }
}

package com.company;

class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 40000){
            System.out.println("The cooking thread is running!");
            System.out.println("I am Happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 40000){
            System.out.println("The chatting with her thread is running!");
            System.out.println("I am Good!");
            i++;
        }
    }
}
public class MultiThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}

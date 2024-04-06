package com.company;

class MyRunnableThread1 implements Runnable{
    public MyRunnableThread1(String name){
        super();
    }

    public void run(){
        int i = 0;
        while (i < 4){
            System.out.println("I am thread 1 not a threat 1");
            i++;
        }
    }
}
class MyRunnableThread2 implements Runnable{
    public void run(){
        int i = 0;
        while (i < 4){
            System.out.println("I am thread 2 not a threat 2");
            i++;
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        MyRunnableThread1 bullet1 = new MyRunnableThread1("Harry");
        Thread gun1 = new Thread(bullet1);

        MyRunnableThread2 bullet2 = new MyRunnableThread2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

        System.out.println("" + gun1.getId());
    }
}

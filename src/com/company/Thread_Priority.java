package com.company;

class Mythr1 extends Thread{
    public Mythr1(String name){
        super(name);
    }

    public void run(){
        int n = 0;
        while(n < 40000){
            System.out.println("Hello This is Thread: " + this.getName());
            n++;
        }
    }

}

public class Thread_Priority {
    public static void main(String[] args) {
        Mythr1 t1 = new Mythr1("Harry1");
        Mythr1 t2 = new Mythr1("Harry2");
        Mythr1 t3 = new Mythr1("Harry3");
        Mythr1 t4 = new Mythr1("Harry4");
        Mythr1 t5 = new Mythr1("Harry5 (Most Important)");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

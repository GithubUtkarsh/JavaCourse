package com.company;

class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }

    public void run(){
        int n = 4;
        System.out.println("Thank You!");
    }

}

public class Thread_Constructor {
    public static void main(String[] args) {

        Mythr t1 = new Mythr("Harry");
        t1.start();

        Mythr t2 = new Mythr("Mahesh");
        t2.start();

        System.out.println("The ID of the thread 1 is: " + t1.getId());
        System.out.println("The Name of the thread 1 is: " + t1.getName());

        System.out.println("The ID of the thread 2 is: " + t2.getId());
        System.out.println("The Name of the thread 2 is: " + t2.getName());
    }
}

package com.company;

class MyNewThr1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 40000){
            System.out.println("Thank you!");
            try{
                Thread.sleep(455);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i < 40000){
            System.out.println("Thank you very much!");
            i++;
        }
    }
}

public class Thread_Methods {
    public static void main(String[] args) {

        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
        t2.start();
    }
}

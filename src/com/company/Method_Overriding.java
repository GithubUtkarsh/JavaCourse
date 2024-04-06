package com.company;
class A{
    int a;
    public int harry(){
        return 4;
    }
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }

    public void meth2(){
        System.out.println("I am method 2 of a class A");
    }
}

class B extends A{
    @Override
    public void meth2(){

        System.out.println("I am method of 2 of class B");
    }

    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
//        a.meth2();
        a.meth1();

        B b = new B();
//        b.meth2();
        b.meth1();


    }
}

package com.company;

interface SampleClass{
    void meth1();
    void meth2();
}
interface ChildSampleClass extends SampleClass{
    void meth3();
    void meth4();
}
class MySampleClass implements ChildSampleClass{
    @Override
    public void meth1() {
        System.out.println("Meth1");
    }
    @Override
    public void meth2() {
        System.out.println("Meth2");
    }
    @Override
    public void meth3() {
        System.out.println("Meth3");
    }
    @Override
    public void meth4() {
        System.out.println("Meth4");
    }
}

public class Interface_Inheritance {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}

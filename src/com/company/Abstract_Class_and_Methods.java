package com.company;

abstract class Parent2{
    Parent2(){
        System.out.println("Mai Parent2 class ka constructor hoon.");
    }
    public void SayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("th");
    }
}




public class Abstract_Class_and_Methods {
    public static void main(String[] args) {

//        Parent2 p = new Parent(); -- Produce Error
        Child2 c = new Child2();
        c.greet();
        c.SayHello();
//        Child3 c3 = new Child3(); -- Produce Error
//        Abstract class are created because inheriting  this class you can create many classes
//        Abstract class are used to create many class ,because it is a standard for creating other classes
    }
}

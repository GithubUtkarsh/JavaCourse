package com.company;
class Base1{
    Base1(){
        System.out.println("I am constructor of base class");
    }
    Base1(int a){
        System.out.println("I am constructor of base class and setting value of x: "+ a);
    }
}
class Derived1 extends Base1{
    Derived1(){
//        super(44);
        System.out.println("I am constructor of derived class");
    }
    Derived1(int x ,int y){
        super(x);
        System.out.println("I am constructor of derived class and setting value of y: "+ y);
    }

}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am constructor of ChildOfDerived class");
    }
    ChildOfDerived(int x ,int y,int z){
        super(x,y);
        System.out.println("I am constructor of derived class and setting value of z: "+ z);
    }

}
public class Constructor_in_Inheritance {
    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Derived1 d = new Derived1(11,22);
        ChildOfDerived cd = new ChildOfDerived(11,22,33);
    }

}

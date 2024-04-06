package com.company;
/*
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void PrintMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived class and setting y now");
        this.y = y;
    }
}
*/
class Animal{
    int speak,run,eat;
    public void speaking(){
        System.out.println("speaking......");
    }
    public void running(){
        System.out.println("running....");
    }
    public void eating(){
        System.out.println("eating....");
    }
}

class Dog extends Animal{
    int Dog;
    public void speak(){
        System.out.print("Dog is ");
        speaking();
    }
    public void eat(){
        System.out.print("Dog is ");
        eating();
    }
}








public class Inheritance_intro {
    public static void main(String[] args) {

/*       Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        b.PrintMe();

        Derived d = new Derived();
        d.setY(44);
        System.out.println(d.getY());
        d.PrintMe();
        */

        Dog d = new Dog();
        d.speak();
        d.eat();


    }
}

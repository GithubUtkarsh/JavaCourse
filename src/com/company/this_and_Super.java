package com.company;

class OneClass{
    int a;
    OneClass(int a){
        this.a=a;
    }
    public int Geta(){
        return a;
    }
}
class TwoClass extends OneClass{
    int b;
    TwoClass(int a ,int b){
        super(a);
        System.out.println("I am a constructor");
    }
}
public class this_and_Super {
    public static void main(String[] args) {

//        OneClass o = new OneClass(33);
//        System.out.println(o.Geta());
        TwoClass t = new TwoClass(22,33);
        System.out.println(t.Geta());
    }
}

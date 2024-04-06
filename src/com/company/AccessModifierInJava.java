package com.company;

class C1{
    public int x = 4;
    protected int y = 45;
    int a = 22;
    private int b = 56;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class AccessModifierInJava {
    public static void main(String[] args) {
        // class Example
        C1 c = new C1();
//        c.meth1();

        // Package Example
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.a);
//        System.out.println(c.b);  // Not access because the private access modifier is not accessed within the same package
                                    // and all the other access modifier can be accessed within the package
    }
}

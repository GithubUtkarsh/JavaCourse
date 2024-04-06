package com.company;

class Circle1{
    public int radius;
    Circle1(){

    }
    Circle1(int r){
        radius = r;
    }
    public double Area(){
        System.out.print("Area of Circle : ");
        return Math.PI*radius*radius;
    }
    public double CirclePerimeter(){
        System.out.print("Perimeter of Circle : ");
        return Math.PI*2*radius;
    }
}

class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int r,int h){
        super(r);
        height = h;
    }
    public double Volume(){
        System.out.print("Volume of Cylinder : ");
        return Math.PI*radius*radius*height;
    }
    public double CylinderPerimeter(){
        System.out.print("Perimeter of Cylinder : ");
        return (Math.PI*Math.PI*4*Math.PI*radius)+(2*height);
    }
}

class Rectangle2{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

//    RecTangle(int l, int b){
//        length= l;
//        breadth = b;
//    }
    public int Area(){
        System.out.print("Area of Rectangle : ");
        return length*breadth;
    }
}
class Cuboid extends Rectangle2{
    private int height;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

//    Cuboid(int l, int b, int h){
//        super(l,b);
//        height = h;
//    }
    public int Volume(){
        System.out.print("Volume of Cuboid : ");
        return Area()*height;
    }
}
public class Inheritance_PracticeSet {
    public static void main(String[] args) {
//        Cylinder1 Objc = new Cylinder1(14, 4);
//        System.out.println(Objc.Volume());
//        System.out.println(Objc.Area());

        Rectangle2 rec = new Rectangle2();
        rec.setLength(12);
        rec.setBreadth(4);
        Cuboid Obj = new Cuboid();
        Obj.setLength(12);
        Obj.setBreadth(4);
        Obj.setHeight(6);
        System.out.println(Obj.Volume());
        System.out.println(Obj.getLength());
        System.out.println(Obj.getHeight());
        System.out.println(Obj.getBreadth());
        System.out.println(rec.Area());
        System.out.println(rec.getLength());
        System.out.println(rec.getBreadth());

    }
}

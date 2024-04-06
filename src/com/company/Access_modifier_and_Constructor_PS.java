package com.company;

import java.util.function.DoubleToIntFunction;

class Cylinder{
    private int height;
    private int radius;

//    public Cylinder(){
//
//    }

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double SurfaceArea(){
        return 2* Math.PI*radius*height + 2* Math.PI*radius*radius;
    }
    public double Volume(){
        return Math.PI *radius * radius*height;
    }
    


}

class Rectangle{
    private int lenght;
    private int breadth;

    public Rectangle() {
        this.lenght = 4;
        this.breadth = 5;
    }

    public int getLenght() {
        return lenght;
    }

    public int getBreadth() {
        return breadth;
    }
}

class Sphere{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double SurfaceArea(){
        return 4 * Math.PI * radius*radius;
    }
    public double Volume(){
        return (4/3d)*Math.PI*radius*radius*radius;
    }
}

public class Access_modifier_and_Constructor_PS {
    public static void main(String[] args) {
      /*  Cylinder c = new Cylinder(12,9);
        c.setHeight(12);
        System.out.println(c.getHeight());
        c.setRadius(9);
        System.out.println(c.getRadius());
        System.out.println(c.SurfaceArea());
        System.out.println(c.Volume());


        Rectangle r= new Rectangle();
        System.out.println(r.getLenght());
        System.out.println(r.getBreadth());
        */


        Sphere s =  new Sphere();
        s.setRadius(4);
        System.out.println(s.getRadius());
        System.out.println(s.SurfaceArea());
        System.out.println(s.Volume());




    }
}

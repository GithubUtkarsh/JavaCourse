package com.company;

import com.sun.security.jgss.GSSUtil;

class Employee{
        int salary;
        String name;

        public int getSalary(){
            return salary;
        }

        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
    }

    class Cellphone{
        public void ring(){
            System.out.println("Ringing...");
        }
        public void vibrate(){
            System.out.println("Vibrating....");
        }
        public void CallFriend(){
            System.out.println("Calling Friend....");
        }
    }
    class Square{
        int side;

        public int area(){
            return side*side;
        }
        public int perimeter(){
            return 4*side;
        }
    }
    class Rectangle1{
        int length,breadth;
        public int area(){
            return length*breadth;
        }
        public int perimeter(){
            return 2*(length+breadth);
        }
    }
    class Tommy{
        public void hit(){
            System.out.println("Hitting a enemy");
        }
        public void run(){
            System.out.println("Running from the enemy");
        }
        public void fire(){
            System.out.println("Firing on the enemy");
        }
    }

    class Circle{

        int r;
        float pi = 3.14f;

        public float area(){
          return pi*r*r;
        }
        public float perimeter(){
            return 2*pi*r;
        }



    }

public class class_PS {
    public static void main(String[] args) {

//        Problem1
        /*
        Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 23;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());

//        Problem 2
        Cellphone asus = new Cellphone();
        asus.CallFriend();
        asus.ring();
        asus.vibrate();
//        Problem 3
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

//        Problem 4
        Rectangle1 rec = new Rectangle();
        rec.length = 20;
        rec.breadth = 10;
        System.out.println(rec.area());
        System.out.println(rec.perimeter());

//        Problem 5
        Tommy vc = new Tommy();
        vc.fire();
        vc.hit();
        vc.run();
        */
//        Problem 6

        Circle c = new Circle();
        c.r=3;
        System.out.println(c.area());
        System.out.println(c.perimeter());







    }

}

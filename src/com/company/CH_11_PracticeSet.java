package com.company;
abstract class Pen{
    abstract void write();
   abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void ChangeNib(){
        System.out.println("Changing the nib");
    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Biting....");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak (){
        System.out.println("Speaking....");
    }
    @Override
    public void eat(){
        System.out.println("Eating....");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping....");
    }
}
    abstract class Telephone{
        abstract void ring();
        abstract void lift();
        abstract void disconnect();
    }
    class SmartPhone2 extends Telephone{

        void charge(){
            System.out.println("Charging....");
        }
        @Override
        void ring(){
            System.out.println("Ringing....");
        }
        @Override
        void lift(){
        System.out.println("Lifting....");
        }
        @Override
        void disconnect(){
        System.out.println("Disconnecting....");
        }
    }
    interface SmartTvRemote{
         void OpenNetflix();
         void volume();
    }
    interface TvRemote extends SmartTvRemote{
        void ChangeChannel();
    }
    class Televison implements TvRemote{
        public void OpenNetflix(){
            System.out.println("Opening Netflix");
        }
        public void volume(){
            System.out.println("Volume Increasing or Decreasing");
        }
        public void ChangeChannel(){
            System.out.println("Changing Channel ");
        }
    }
public class CH_11_PracticeSet {
    public static void main(String[] args) {
        // Q1 + Q2
        FountainPen p = new FountainPen();
        p.write();
        p.refill();
        p.ChangeNib();

        // Q3
        Human h = new Human();
        h.eat();
        h.sleep();

        // Q4
        Telephone t = new SmartPhone2();
        t.disconnect();
//        t.charge(); --> cannot use the method of SmartPhone Class

        SmartPhone2 phone = new SmartPhone2();
        phone.charge();
        phone.disconnect();

        //Q5
        Monkey m = new Human();
        m.bite();
        //m.speak(); // --> cannot use speak method because the reference is monkey which does not have speaks method

        BasicAnimal b = new Human();
        b.eat();
        //b.speak(); //--> Error
        Human harry = new Human();
        harry.sleep();
        harry.speak();

        //Q6
        Televison tv = new Televison();
        tv.ChangeChannel();
        tv.OpenNetflix();

        SmartTvRemote t1 = new Televison();
        //t1.ChangeChannel();

    }

}

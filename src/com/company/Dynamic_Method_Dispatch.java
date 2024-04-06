package com.company;
class Phone{
    public void ShowTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone.....");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone.....");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        //    Phone obj = new Phone();
//    SmartPhone smobj = new SmartPhone();

        Phone obj = new SmartPhone(); // Allowed
//    SmartPhone smobj = new Phone(); // Not Allowed

        obj.ShowTime();
        obj.on();
//        obj.music();// Not Allowed
        /*
            Allowed - If you create an object of subclass with a reference of superclass
            Not Allowed - If you create an object of superclass with a reference of subclass



         */

    }

}

package com.company;
interface MyCamera2{
    void TakeSnap();
    void RecordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void Record4kVideo(){
//        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi2{
    String[] GetNetwork();
    void ConnectToNetwork(String Network);
}
class MyCellPhone2{
    void CallNumber(int number){
        System.out.println("Calling "+ number);
    }
    void PickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2,MyWifi2 {
    @Override
    public void TakeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void RecordVideo() {
        System.out.println("Recording Video");
    }

    //    public void Record4kVideo(){
//        System.out.println("Recording 4k video");
//    }
    public String[] GetNetwork() {
        System.out.println("Getting List of Networks: ");
        String[] NetworkList = {"Harry", "Sam", "Rahul"};
        return NetworkList;
    }

    @Override
    public void ConnectToNetwork(String Network) {
        System.out.println("Connecting to " + Network);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2(); // This is a smartphone but, use it as a camera
        cam.Record4kVideo();
//        cam.GetNetwork(); --> Not Allowed

        MySmartPhone2 s = new MySmartPhone2();
        s.GetNetwork();
        s.RecordVideo();
        s.CallNumber(849348343);

        MyCellPhone2 c = new MyCellPhone2();
        c.CallNumber(56776757);
    }
}

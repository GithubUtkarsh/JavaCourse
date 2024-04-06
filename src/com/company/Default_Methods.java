package com.company;

interface MyCamera{
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
interface MyWifi{
    String[] GetNetwork();
    void ConnectToNetwork(String Network);
}
class MyCellPhone{
    void CallNumber(int number){
        System.out.println("Calling "+ number);
    }
    void PickCall(){
        System.out.println("Connecting....");
    }
}
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
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
    public String[] GetNetwork(){
        System.out.println("Getting List of Networks: ");
        String[] NetworkList={"Harry","Sam","Rahul"};
        return NetworkList;
    }
    @Override
    public void ConnectToNetwork(String Network) {
        System.out.println("Connecting to "+ Network);
    }

}

public class Default_Methods {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.Record4kVideo();
//        ms.greet(); --> Produce an error!
        String[] ar = ms.GetNetwork();
        for (String items:ar) {
            System.out.println(items);
        }
    }
}

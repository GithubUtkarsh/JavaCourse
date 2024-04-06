package com.company;

interface Bicycle{
    int a = 45;
    void ApplyBrake(int decrement);
    void SpeedUp(int increment);
}
interface HornBicycle{
    int x = 44;
    void BlowHornKg3();
    void BlowHornhn();
}

class AvonCycle implements Bicycle,HornBicycle{
//    public int x = 5;
    @Override
    public void ApplyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    @Override
    public void SpeedUp(int increment){
        System.out.println("Applying SpeedUp");
    }

    @Override
    public void BlowHornKg3() {
        System.out.println("kabhi khusi kabhi gum pee pee pee pee");
    }
    @Override
    public void BlowHornhn(){
        System.out.println("main hoon na poo poo poo poo");
    }
}
public class Interfaces {
    public static void main(String[] args) {

        AvonCycle Av = new AvonCycle();
        Av.ApplyBrake(4);
        Av.SpeedUp(5);
        // You can create properties in Interfaces
        System.out.println("a = "+Av.a);
        System.out.println("x = "+Av.x);

        // You cannot modify the properties in Interfaces as they are final
//         cycleHarry.a = 454;
//        System.out.println(cycleHarry.a);
        Av.BlowHornKg3();
        Av.BlowHornhn();
    }
}

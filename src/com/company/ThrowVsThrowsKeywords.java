package com.company;

class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
public class ThrowVsThrowsKeywords {
   public static double area(int r) throws NegativeRadiusException{
      if(r < 0){
          throw new NegativeRadiusException();
      }
       return Math.PI * r * r;
   }

    public static int divide(int a,int b)throws ArithmeticException{
       // Made by Harry
       return a/b;
   }

    public static void main(String[] args) {
        // Shivam - Uses divide function created by Harry
        try{
//            int ans = divide(4,0);
//            System.out.println(ans);
            double ans = area(4);
            System.out.println(ans);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the five digit number :");
        int n = sc.nextInt();

        if (n<10000 || n > 99999){
            System.out.println("Invalid Input ! Try Again");
            return;
        }
        int sum = sod(n);
        System.out.println("Sum of digit is : "+ sum);

       
    }

    public static int sod(int num){

        int sum = 0;
        while(num> 0){
            sum = sum + num %10;
            num = num /10;

        }
        return sum;
    }




}

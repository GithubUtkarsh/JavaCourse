package com.company;

import java.util.Scanner;
import java.util.Random;

class game{
    public int num;
    public int gen_num;
    public int num_of_guesses = 0;

    public int getNumber(){
        return num_of_guesses;
    }
    public void setNumber(int num_of_guesses){
        this.num_of_guesses = num_of_guesses;
    }

    game(){
        Random rand = new Random();
        gen_num = rand.nextInt(100);
//        System.out.println(gen_num);
    }
    void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
    }
    boolean isCorrectNumber(){
        num_of_guesses++;
        if (num == gen_num){
            System.out.println("Your guess is correct!");
            System.out.format("it was %d\nYou guessed it in %d attempts",gen_num, num_of_guesses);
            return true;
        }
        else if (num>gen_num){
            System.out.println("You guessed to high number!");
        }
        else if (num<gen_num){
            System.out.println("You guessed to low number!");
        }
            return false;
    }

}

public class Guess_the_number {
    public static void main(String[] args) {

        game player1 = new game();
        boolean b = false;
        while (!b) {
            player1.takeUserInput();
            b = player1.isCorrectNumber();
        }
    }
}

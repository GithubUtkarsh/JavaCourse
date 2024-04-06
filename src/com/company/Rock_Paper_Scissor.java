package com.company;
import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int input,rck,ppr,sir,win=0,lose=0,tie=0,y = 1;

        while (y<=5) {
            System.out.println('\n'+"Match No.- " + y);
            System.out.println("Select from these: ");
            System.out.println("1 for Rock");
            System.out.println("2 for Paper");
            System.out.println("3 for Scissors");
            input = sc.nextInt();

            rck = rand.nextInt(3);
            ppr = rand.nextInt(3);
            sir = rand.nextInt(3);


            switch (input) {
                case 1:
                    if (rck > sir) {
                        System.out.println("You choose rock");
                        System.out.println("System choose scissors");
                        System.out.println("you won!");
                        win = win++;
                    } else if (ppr > rck) {
                        System.out.println("You choose rock");
                        System.out.println("System choose paper");
                        System.out.println("You Lose!");
                        lose = lose++;

                    } else if (rck == rck) {
                        System.out.println("You both choose rock");
                        System.out.println("Match tie!");
                        tie = tie++;
                    }
                    break;
                case 2:
                    if (ppr > rck) {
                        System.out.println("You choose paper");
                        System.out.println("System choose rock");
                        System.out.println("you won!");
                        win = win++;

                    } else if (sir > ppr) {
                        System.out.println("You choose paper");
                        System.out.println("System choose scissors");
                        System.out.println("You Lose!");
                        lose = lose++;
                    } else if (ppr == ppr) {
                        System.out.println("You both choose paper");
                        System.out.println("Match Tie!");
                        tie = tie++;
                    }
                    break;
                case 3:
                    if (sir > ppr) {
                        System.out.println("You choose scissors");
                        System.out.println("System choose paper");
                        System.out.println("you won!");
                        win = win++;

                    } else if (rck > sir) {
                        System.out.println("You choose scissors");
                        System.out.println("System choose rock");
                        System.out.println("You Lose!");
                        lose = lose++;
                    } else if (sir == sir) {
                        System.out.println("You both choose scissors");
                        System.out.println("Match Tie!");
                        tie = tie++;
                    }
                    break;
                default:
                    System.out.println("Invalid Selection!");
            }
            y++;
        }
        System.out.println("\n" + "Overall Result");
        if (win>lose && win> tie){
            System.out.println("Congratulation! You won this game!");
        }
        else if (tie > win && tie >lose){
            System.out.println("Oops! Match Tie");
        }
        else if (win == lose ){
            System.out.println("Oops! Match Tie");
        }
        else if(lose > win && lose > tie ) {
            System.out.println("Sorry! You lost this game");
        }
        else if (win == tie ){
            System.out.println("Oops! Match Tie");
        }
    }
}

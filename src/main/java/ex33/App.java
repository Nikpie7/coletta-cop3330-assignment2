/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex33;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What's your question?\n> ");
        String response = shakeEightBall(scan.nextLine());

        System.out.println(response);
    }

    //takes in question as a parameter, but doesn't actually use it for the output calculation (like how an actual 8-ball works :) )
    public static String shakeEightBall(String question)
    {
        String[] outcomes = { "Yes", "No", "Maybe", "Ask again later" };
        return outcomes[randomResponse()];
    }

    public static int randomResponse()
    {
        return (int)(Math.random()*4);
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex29;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        int rate = getInput();
        System.out.println("It will take " + calcDouble(rate) + " years to double your initial investment.");
    }

    public static int getInput()
    {
        Scanner scan = new Scanner(System.in);
        String input;
        boolean v;

        do {
            System.out.print("What is the rate of return? ");
            input = scan.nextLine();
            v = validInput(input);
            if(!v)
                System.out.println("Sorry. That's not a valid input.");
        } while(!v);

        return Integer.parseInt(input);
    }

    public static boolean validInput(String input)
    {
        int i;
        try {
            i = Integer.parseInt(input);
        }
        catch(Exception e) {
            return false;
        }

        return i != 0;
    }

    public static int calcDouble(int rate)
    {
        return (int)Math.ceil(72.0/rate);
    }
}
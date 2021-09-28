/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex32;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        do {
            runGame(getInput("Enter the difficulty level (1, 2, or 3): "));
        } while(continueGame());
    }

    public static int getInput(String prompt)
    {
        Scanner scan = new Scanner(System.in);
        String input;
        boolean v;

        do {
            System.out.print(prompt);
            input = scan.nextLine();
            v = justNumbers(input);
            if(!v)
                System.out.println("Sorry. That's not a valid input.");
        } while(!v);

        return Integer.parseInt(input);
    }

    public static boolean justNumbers(String input)
    {
        char[] charArr = input.toCharArray();

        for (char c : charArr)
            if (c < '0' || c > '9')
                return false;
        return true;
    }

    public static void runGame(int diff)
    {
        Scanner scan = new Scanner(System.in);
        int num = generateNumber(diff);
        int guessCount = 1;
        int input;
        String stringInput;

        System.out.print("I have my number. What's your guess? ");
        stringInput = scan.next();
        if(!justNumbers(stringInput) || Integer.parseInt(stringInput) < 1)
            input = -1;
        else
            input = Integer.parseInt(stringInput);

        while(input != num) {
            if( input == -1 )
                System.out.println("Invalid input. Guess again: ");
            else if( input < num )
                System.out.print("Too low. Guess again: ");
            else
                System.out.print("Too high. Guess again: ");

            stringInput = scan.next();
            if(!justNumbers(stringInput) || Integer.parseInt(stringInput) < 1)
                input = -1;
            else
                input = Integer.parseInt(stringInput);

            guessCount++;
        }

        System.out.println("You got it in " + guessCount + " guesses!\n");
    }

    public static int generateNumber(int diff)
    {
        int range = (int)Math.pow(10, diff);
        return (int)(Math.random() * range) + 1;
    }

    public static boolean continueGame()
    {
        Scanner scan = new Scanner(System.in);
        String input;
        boolean v;

        do {
            System.out.print("Do you wish to play again (Y/N)? ");
            input = scan.nextLine();
            v = input.length() != 1 || (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));
            if(v)
                System.out.println("Sorry. That's not a valid input.");
        } while(v);

        System.out.println();
        return input.equalsIgnoreCase("y");
    }
}
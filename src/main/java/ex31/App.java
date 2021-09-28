/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex31;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        int restingPulse = getInput("Resting Pulse: ");
        int age = getInput("Age: ");

        printTable(age, restingPulse);
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

    public static int calcHeartRate(int age, int restingHR, int intensity)
    {
        return (int)Math.round((((220 - age) - restingHR) * (intensity/100.0)) + restingHR);
    }

    public static void printTable(int A, int HR)
    {
        System.out.println("Intensity    | Rate");
        System.out.println("-------------------");
        for(int I = 55; I <= 95; I += 5)
            System.out.println(I + "%\t\t| " + calcHeartRate(A, HR, I) + " bpm");
    }
}
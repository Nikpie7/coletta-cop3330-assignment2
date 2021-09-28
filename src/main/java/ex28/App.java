/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex28;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        int sum = 0;
        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 5; i++)
            sum += promptInput(s);

        System.out.println("The total is " + sum + ".");
    }

    public static int promptInput(Scanner scan)
    {
        System.out.print("Enter a number: ");
        return Integer.parseInt(scan.next());
    }
}
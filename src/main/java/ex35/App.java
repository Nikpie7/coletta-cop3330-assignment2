/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex35;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String winner = selectWinner(promptContestantList(scan));
        System.out.println("The winner is... " + winner + ".");
    }

    public static ArrayList<String> promptContestantList(Scanner scan)
    {
        ArrayList<String> output = new ArrayList<String>();
        System.out.print("Enter a name: ");
        String temp = scan.nextLine();

        while(!temp.equals("")) {
            output.add(temp);
            System.out.print("Enter a name: ");
            temp = scan.nextLine();
        }

        return output;
    }

    public static String selectWinner(ArrayList<String> C)
    {
        return C.get((int)(Math.random() * C.size()));
    }
}
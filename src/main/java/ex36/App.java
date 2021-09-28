/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex36;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        printResults(fillList(scan));
    }

    public static void printResults(ArrayList<Integer> I)
    {
        System.out.println("Numbers: " + I);
        System.out.println("The average is " + average(I));
        System.out.println("The minimum is " + min(I));
        System.out.println("The maximum is " + max(I));
        System.out.println("The standard deviation is " + Math.round(std(I, average(I)) * 100)/100.0);
    }

    public static double average(ArrayList<Integer> I)
    {
        int sum = 0;
        for (Integer integer : I)
            sum += integer;
        return sum/((double)I.size());
    }

    public static int min(ArrayList<Integer> I)
    {
        int value = I.get(0);
        for (int i = 1; i < I.size(); i++)
            if (value > I.get(i))
                value = I.get(i);
        return value;
    }

    public static int max(ArrayList<Integer> I)
    {
        int value = I.get(0);
        for (int i = 1; i < I.size(); i++)
            if (value < I.get(i))
                value = I.get(i);
        return value;
    }

    public static double std(ArrayList<Integer> I, double mean)
    {
        double sum = 0;
        for (Integer integer : I)
            sum += Math.pow(integer - mean, 2);
        return Math.sqrt( sum / (I.size()) );
    }

    public static ArrayList<Integer> fillList(Scanner scan)
    {
        ArrayList<Integer> output = new ArrayList<Integer>();
        System.out.print("Enter a number: ");
        String temp = scan.nextLine();
        int type = inputType(temp);
        while(type != 1) {
            if(type == -1)
                System.out.println("Invalid input!");
            else
                output.add(Integer.parseInt(temp));
            System.out.print("Enter a number: ");
            temp = scan.nextLine();
            type = inputType(temp);
        }

        return output;
    }

    public static int inputType(String s)
    {
        if(s.equalsIgnoreCase("done"))
            return 1;
        else if(justNumbers(s))
            return 0;
        else
            return -1;
    }

    public static boolean justNumbers(String input)
    {
        char[] charArr = input.toCharArray();

        for (char c : charArr)
            if (c < '0' || c > '9')
                return false;
        return true;
    }
}
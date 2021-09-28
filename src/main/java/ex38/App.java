/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex38;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = inputArray(scan);

        System.out.println("The even numbers are " + filterEvenNumbers(list));
    }

    public static ArrayList<Integer> inputArray(Scanner scan) {
        ArrayList<Integer> output = new ArrayList<>();
        String inputs;

        System.out.print("Enter a list of numbers, separated by spaces: ");
        inputs = scan.nextLine();

        String[] outputStrings = inputs.split(" ");

        for (String outputString : outputStrings) output.add(Integer.parseInt(outputString));

        return output;
    }

    public static ArrayList<Integer> filterEvenNumbers(ArrayList<Integer> I) {
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < I.size(); i++)
            if (I.get(i) % 2 == 0)
                output.add(I.get(i));
        return output;
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex37;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int min, spec, num;

        System.out.print("What's the minimum length? ");
        min = Integer.parseInt(scan.next());
        System.out.print("How many special characters? ");
        spec = Integer.parseInt(scan.next());
        System.out.print("How many numbers? ");
        num = Integer.parseInt(scan.next());

        System.out.println("Your password is " + generatePassword(min, spec, num));
    }

    public static String generatePassword(int minLength, int numSpecial, int numNumbers)
    {
        int length;
        if ((numSpecial + numNumbers) * 2 >= minLength)
            length = (numSpecial + numNumbers) * 2 + 1;
        else
            length = minLength;

        ArrayList<Character> passwordArray = new ArrayList<>();

        for(int i = 0; i < length; i++) {
            if (i < numSpecial)
                passwordArray.add(generateRandomSpecial());
            else if (i < numNumbers + numSpecial)
                passwordArray.add(generateRandomNumber());
            else
                passwordArray.add(generateRandomLetter());
        }

        Collections.shuffle(passwordArray);

        return createString(passwordArray);
    }

    public static char generateRandomLetter()
    {
        return (char)((int)(Math.random() * 26) + 97);
    }

    public static char generateRandomNumber()
    {
        return (char)((int)(Math.random() * 10) + 48);
    }

    public static char generateRandomSpecial()
    {
        return (char)((int)(Math.random() * 11) + 33);
    }

    public static String createString(ArrayList<Character> C)
    {
        StringBuilder output = new StringBuilder();
        for (Character character : C)
            output.append(character);
        return output.toString();
    }
}
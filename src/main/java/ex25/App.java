/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex25;

public class App
{
    public static void main(String[] args)
    {
        passwordStrengthPrinter("12345");
        passwordStrengthPrinter("abcdef");
        passwordStrengthPrinter("abc123xyz");
        passwordStrengthPrinter("1337h@xor");
    }

    //prints out the password strength
    public static void passwordStrengthPrinter(String password)
    {
        int str = passwordValidator(password);

        switch(str) {
            case 1:
                System.out.println("The password '" + password + "' is a very weak password.");
                break;
            case 2:
                System.out.println("The password '" + password + "' is a weak password.");
                break;
            case 3:
                System.out.println("The password '" + password + "' is an decent password.");
                break;
            case 4:
                System.out.println("The password '" + password + "' is a strong password.");
                break;
            case 5:
                System.out.println("The password '" + password + "' is a very strong password.");
                break;
        }
    }

    //returns the strength of the password, 1 being very weak, 5 being very strong
    public static int passwordValidator(String password)
    {
        if(shortPassword(password))
        {
            if(containsNumbersOnly(password))
                return 1;
            else if(containsLettersOnly(password))
                return 2;
        }
        else if(containsNumbers(password))
        {
            if(containsSpecial(password))
                return 5;
            else
                return 4;
        }
        return 3;
    }

    //returns true if password is less than eight characters
    public static boolean shortPassword(String input)
    {
        return input.length() < 8;
    }

    //returns true if string contains a number
    public static boolean containsNumbers(String input)
    {
        char[] charArr = input.toCharArray();

        for (char c : charArr)
            if (c >= '0' && c <= '9')
                return true;
        return false;
    }

    //returns true if the string is entirely made of numbers
    public static boolean containsNumbersOnly(String input)
    {
        char[] charArr = input.toCharArray();

        for (char c : charArr)
            if (c < '0' || c > '9')
                return false;
        return true;
    }

    //returns true if the string is made of letters only
    public static boolean containsLettersOnly(String input)
    {
        char[] charArr = input.toCharArray();

        for (char c : charArr)
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
                return false;
        return true;
    }

    //returns true if the string contains a non-number and non-letter character
    public static boolean containsSpecial(String input)
    {
        char[] charArr = input.toCharArray();

        for (char c : charArr)
            if ((c < '0' || c > '9') && (c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
                return true;
        return false;
    }
}
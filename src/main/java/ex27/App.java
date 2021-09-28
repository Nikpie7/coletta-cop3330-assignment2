/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex27;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String first, last, zip, ID;

        System.out.print("Enter the first name: ");
        first = scan.nextLine();
        System.out.print("Enter the last name: ");
        last = scan.nextLine();
        System.out.print("Enter the ZIP code: ");
        zip = scan.nextLine();
        System.out.print("Enter the employee ID: ");
        ID = scan.nextLine();

        validateInput(first, last, zip, ID);
    }

    public static void validateInput(String firstName, String lastName, String zipcode, String employeeID)
    {
        int flag = 0;
        if(!validateNameLength(firstName)) {
            System.out.println("The first name must be at least 2 characters long.");
            flag = 1;
        }
        if(!validateNameLength(lastName)) {
            System.out.println("The last name must be at least 2 characters long.");
            flag = 1;
        }
        if(!validateNameFilledIn(firstName)) {
            System.out.println("The first name must be filled in.");
            flag = 1;
        }
        if(!validateNameFilledIn(lastName)) {
            System.out.println("The last name must be filled in.");
            flag = 1;
        }
        if(!validateIDFormat(employeeID)) {
            System.out.println("The employee ID must be in the format of AA-1234.");
            flag = 1;
        }
        if(!validateZipcode(zipcode)) {
            System.out.println("The zipcode must be a 5 digit number.");
            flag = 1;
        }

        if(flag == 0)
            System.out.println("There were no errors found.");
    }

    public static boolean validateNameLength(String name)
    {
        return name.length() > 1;
    }

    public static boolean validateNameFilledIn(String name)
    {
        return name.length() != 0;
    }

    public static boolean validateIDFormat(String id)
    {
        return id.length() == 7
                && justLetters(id.substring(0, 2))
                && id.charAt(2) == '-'
                && justNumbers(id.substring(3));
    }

    public static boolean validateZipcode(String zip)
    {
        return zip.length() == 5 && justNumbers(zip);
    }

    //hidden method that check if a string contains only numbers
    private static boolean justNumbers(String input)
    {
        char[] charArr = input.toCharArray();

        for (char c : charArr)
            if (c < '0' || c > '9')
                return false;
        return true;
    }

    //hidden method that check if a string contains only letters
    private static boolean justLetters(String input)
    {
        char[] charArr = input.toCharArray();

        for (char c : charArr)
            if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z'))
                return false;
        return true;
    }
}
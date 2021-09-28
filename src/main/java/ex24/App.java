/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex24;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();

        if(isAnagram(str1, str2))
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        else
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
    }

    static boolean isAnagram(String s1, String s2)
    {
        if (s1.length() != s2.length())
            return false;

        //sorts both strings to be in alphabetic order.
        char temp1[] = s1.toCharArray();
        char temp2[] = s2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);

        //checks character by character in alphabetic order to see if it can be an anagram.
        for (int i = 0; i < s1.length(); i++)
            if(temp1[i] != temp2[i])
                return false;
        return true;
    }
}
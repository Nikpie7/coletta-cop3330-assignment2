/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex30;

public class App
{
    public static void main(String[] args)
    {
        generateTable(12, 12);
    }

    public static void generateTable(int w, int h)
    {
        for(int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++)
                System.out.print(i * j + "\t");
            System.out.println();
        }
    }
}
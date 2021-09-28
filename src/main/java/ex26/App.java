/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex26;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        double balance, monthlyPayment;
        int APR;
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your balance? ");
        balance = Double.parseDouble(scan.next());
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = Integer.parseInt(scan.next());
        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = Double.parseDouble(scan.next());

        PaymentCalculator P = new PaymentCalculator(balance, APR, monthlyPayment);

        System.out.println("It will take you " + P.calculateMonthsUntilPaidOff() + " months to pay off this card.");
    }
}


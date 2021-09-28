/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex26;

public class PaymentCalculator
{
    private final double i, b, p;

    public PaymentCalculator(double balance, double APR, double monthlyPayment)
    {
        i = (APR / 100.0) / 365.0;
        b = Math.round(balance * 100)/100.0;
        p = Math.round(monthlyPayment * 100)/100.0;
    }

    public int calculateMonthsUntilPaidOff()
    {
        return (int)(Math.ceil(-(1/30.0) * Math.log(1 + (b/p) * (1 - Math.pow((1 + i), 30))) / (Math.log(1 + i))));
    }


}
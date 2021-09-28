/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex26;

import junit.framework.TestCase;

public class PaymentCalculatorTest extends TestCase {

    public void testCalculateMonthsUntilPaidOff() {
        PaymentCalculator calc1 = new PaymentCalculator(5000, 12, 100);
        assertEquals(70, calc1.calculateMonthsUntilPaidOff());
        PaymentCalculator calc2 = new PaymentCalculator(1000, 15, 50);
        assertEquals(24, calc2.calculateMonthsUntilPaidOff());
        PaymentCalculator calc3 = new PaymentCalculator(950000.01, 6.2, 10854.25);
        assertEquals(117, calc3.calculateMonthsUntilPaidOff());
    }
}
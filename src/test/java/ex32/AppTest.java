/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex32;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testJustNumbers() {
        assertTrue(App.justNumbers("1"));
        assertTrue(App.justNumbers("3"));
        assertFalse(App.justNumbers("Two"));
    }

    public void testGenerateNumber() {
        int num1 = App.generateNumber(1);
        assertTrue(num1 > 0 && num1 <= 10);
        int num2 = App.generateNumber(2);
        assertTrue(num2 > 0 && num2 <= 100);
        int num3 = App.generateNumber(3);
        assertTrue(num3 > 0 && num3 <= 1000);
    }
}
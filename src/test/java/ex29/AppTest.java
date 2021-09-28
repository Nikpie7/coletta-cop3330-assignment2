/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex29;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testValidInput() {
        assertTrue(App.validInput("4"));
        assertFalse(App.validInput("ABC"));
        assertFalse(App.validInput("0"));
    }

    public void testCalcDouble() {
        assertEquals(18, App.calcDouble(4));
        assertEquals(2, App.calcDouble(71));
    }
}
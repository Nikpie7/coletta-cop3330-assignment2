/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex27;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testValidateNameLength() {
        assertTrue(App.validateNameLength("John"));
        assertFalse(App.validateNameLength("J"));
    }

    public void testValidateNameFilledIn() {
        assertTrue(App.validateNameFilledIn("Johnson"));
        assertFalse(App.validateNameFilledIn(""));
    }

    public void testValidateIDFormat() {
        assertTrue(App.validateIDFormat("TK-4321"));
        assertFalse(App.validateIDFormat("A12-1234"));
        assertFalse(App.validateIDFormat("12-1234"));
        assertFalse(App.validateIDFormat("TK-ABCD"));
    }

    public void testValidateZipcode() {
        assertTrue(App.validateZipcode("55555"));
        assertFalse(App.validateZipcode("ABCDE"));
        assertFalse(App.validateZipcode("657"));
    }
}
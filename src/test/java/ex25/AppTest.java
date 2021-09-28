/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex25;

import junit.framework.TestCase;

public class AppTest extends TestCase {
    public void testPasswordValidator() {
        assertEquals(1, App.passwordValidator("12345"));
        assertEquals(2, App.passwordValidator("abcdef"));
        assertEquals(3, App.passwordValidator("john123"));
        assertEquals(3, App.passwordValidator("GeorgeWBush"));
        assertEquals(4, App.passwordValidator("abc123xyz"));
        assertEquals(5, App.passwordValidator("1337h@xor!"));
    }

    public void testShortPassword() {
        assertTrue(App.shortPassword("12345"));
        assertFalse(App.shortPassword("aaaaAAAHHHH!!"));
    }

    public void testContainsNumbers() {
        assertTrue(App.containsNumbers("abcd1e"));
        assertFalse(App.containsNumbers("JerrySeinfeld"));
    }

    public void testContainsNumbersOnly() {
        assertTrue(App.containsNumbersOnly("102030906"));
        assertFalse(App.containsNumbersOnly("h3ll0"));
    }

    public void testContainsLettersOnly() {
        assertTrue(App.containsLettersOnly("alphabetSoup"));
        assertFalse(App.containsLettersOnly("alphabet_Soup"));
    }

    public void testContainsSpecial() {
        assertTrue(App.containsSpecial("thisShouldBeVerySpecial!"));
        assertFalse(App.containsSpecial("thisIsntSpecialWhatsoever1"));
    }
}
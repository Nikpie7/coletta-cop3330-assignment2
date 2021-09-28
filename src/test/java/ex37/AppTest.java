/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex37;

import junit.framework.TestCase;

import java.util.ArrayList;

public class AppTest extends TestCase {

    public void testGeneratePassword() {
        assertEquals(13, App.generatePassword(10, 3, 3).length());
        assertEquals(10, App.generatePassword(10, 1, 0).length());
        assertEquals(101, App.generatePassword(7, 25, 25).length());
    }

    public void testCreateString() {
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('T');
        chars.add('e');
        chars.add('s');
        chars.add('t');
        chars.add('!');
        assertEquals("Test!", App.createString(chars));
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex24;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testIsAnagram() {
        assertTrue(App.isAnagram("note","tone"));
        assertFalse(App.isAnagram("apple","applesauce"));
        assertTrue(App.isAnagram("listen","silent"));
        assertFalse(App.isAnagram("pear","hear"));
    }
}
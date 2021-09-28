/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex31;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testJustNumbers() {
        assertTrue(App.justNumbers("65"));
        assertTrue(App.justNumbers("22"));
        assertFalse(App.justNumbers("sixty-five"));
        assertFalse(App.justNumbers("5th"));
    }

    public void testCalcHeartRate() {
        assertEquals(138, App.calcHeartRate(22, 65, 55));
        assertEquals(158, App.calcHeartRate(22, 65, 70));
        assertEquals(185, App.calcHeartRate(22, 65, 90));
    }
}
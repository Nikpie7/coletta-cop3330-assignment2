/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex33;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testRandomResponse() {
        int num = App.randomResponse();
        assertTrue(num > 0 && num < 5);
        num = App.randomResponse();
        assertTrue(num > 0 && num < 5);
        num = App.randomResponse();
        assertTrue(num > 0 && num < 5);
        num = App.randomResponse();
        assertTrue(num > 0 && num < 5);
    }
}
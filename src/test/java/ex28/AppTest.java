/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex28;

import junit.framework.TestCase;
import java.util.Scanner;

public class AppTest extends TestCase {

    public void testPromptInput() {
        Scanner scan1 = new Scanner("1");
        assertEquals(1, App.promptInput(scan1));
        Scanner scan2 = new Scanner("2");
        assertEquals(2, App.promptInput(scan2));
        Scanner scan3 = new Scanner("99999");
        assertEquals(99999, App.promptInput(scan3));
    }
}
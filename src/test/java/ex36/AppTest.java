/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex36;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Scanner;

public class AppTest extends TestCase {
    ArrayList<Integer> testArray = new ArrayList<>();
    Scanner scan;

    public void testAverage() {
        scan = new Scanner("100\n200\n1000\n300\ndone\n");
        testArray = App.fillList(scan);

        assertEquals(400.0, App.average(testArray));
    }

    public void testMin() {
        scan = new Scanner("100\n200\n1000\n300\ndone\n");
        testArray = App.fillList(scan);

        assertEquals(100, App.min(testArray));
    }

    public void testMax() {
        scan = new Scanner("100\n200\n1000\n300\ndone\n");
        testArray = App.fillList(scan);

        assertEquals(1000, App.max(testArray));
    }

    public void testStd() {
        scan = new Scanner("100\n200\n1000\n300\ndone\n");
        testArray = App.fillList(scan);

        assertEquals(353.55, Math.round(App.std(testArray, App.average(testArray)) * 100)/100.0);
    }
}
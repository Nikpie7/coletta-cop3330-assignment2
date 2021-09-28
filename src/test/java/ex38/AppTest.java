/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex38;

import junit.framework.TestCase;

import java.util.ArrayList;

public class AppTest extends TestCase {

    public void testFilterEvenNumbers() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(2);
        result.add(4);
        assertEquals(result, App.filterEvenNumbers(list));
    }
}
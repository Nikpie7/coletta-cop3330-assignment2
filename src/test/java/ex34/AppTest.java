/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex34;

import junit.framework.TestCase;
import java.util.ArrayList;
import java.util.Scanner;

public class AppTest extends TestCase {

    public void testRemoveEmployee() {
        ArrayList<String> Employees = App.createEmployeeList();
        String remove = "John Smith";
        ArrayList<String> testRemove = App.removeEmployee(Employees, new Scanner(remove));
        Employees.remove(remove);
        assertEquals(Employees, testRemove);
    }
}
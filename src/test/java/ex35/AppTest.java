/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex35;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Scanner;

public class AppTest extends TestCase {

    public void testPromptContestantList() {
        Scanner s = new Scanner("Homer\nBart\nLisa\n\n");
        ArrayList<String> contestants = new ArrayList<String>();
        contestants.add("Homer");
        contestants.add("Bart");
        contestants.add("Lisa");
        assertEquals(contestants, App.promptContestantList(s));
    }

    public void testSelectWinner() {
        ArrayList<String> contestants = new ArrayList<String>();
        contestants.add("Homer");
        contestants.add("Bart");
        String winner = App.selectWinner(contestants);
        assertTrue(winner.equals("Homer") || winner.equals("Bart"));
    }
}
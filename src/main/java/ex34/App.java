/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex34;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> employees = createEmployeeList();
        printEmployees(employees);
        employees = removeEmployee(employees, scan);
        printEmployees(employees);
    }

    public static ArrayList<String> removeEmployee(ArrayList<String> E, Scanner s)
    {
        System.out.print("Enter an employee name to remove: ");
        E.remove(s.nextLine());
        System.out.println();
        return E;
    }

    public static ArrayList<String> createEmployeeList()
    {
        ArrayList<String> E = new ArrayList<String>();

        E.add("John Smith");
        E.add("Jackie Jackson");
        E.add("Chris Jones");
        E.add("Amanda Cullen");
        E.add("Jeremy Goodwin");

        return E;
    }

    public static void printEmployees(ArrayList<String> employees)
    {
        System.out.println("There are " + employees.size() + " employees: ");
        for(String e : employees)
            System.out.println(e);
        System.out.println();
    }
}
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package ex39;
import java.util.*;

public class App
{
    public static void main(String[] args)
    {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("John", "Johnson", "Manager", "2016-12-31");
        employees[1] = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        employees[2] = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        employees[3] = new Employee("Jake", "Jacobson", "Programmer");
        employees[4] = new Employee("Jacquelyn", "Jackson", "DBA");
        employees[5] = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");

        outputEmployeeTable(sortEmployees(employees));
    }

    public static Employee[] sortEmployees(Employee[] E)
    {
        Employee temp;
        for (int i = 0; i < E.length; i++)
            for (int j = i + 1; j < E.length; j++)
                if (E[i].getFirstName().compareTo(E[j].getFirstName()) > 0)
                {
                    temp = E[i];
                    E[i] = E[j];
                    E[j] = temp;
                }
        return E;
    }

    public static void outputEmployeeTable(Employee[] E)
    {
        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|-----------------");

        for(Employee e : E)
            System.out.format("%-19s | %-17s | %s\n", e.getFirstName() + " " + e.getLastName(), e.getPosition(), e.getSeparationDate());
    }
}
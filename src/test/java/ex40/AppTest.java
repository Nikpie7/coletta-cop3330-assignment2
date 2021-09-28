package ex40;

import junit.framework.TestCase;

public class AppTest extends TestCase {

    public void testSearchEmployees() {
        Employee[] employees = new Employee[6];
        employees[0] = new Employee("John", "Johnson", "Manager", "2016-12-31");
        employees[1] = new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05");
        employees[2] = new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19");
        employees[3] = new Employee("Jake", "Jacobson", "Programmer");
        employees[4] = new Employee("Jacquelyn", "Jackson", "DBA");
        employees[5] = new Employee("Sally", "Webber", "Web Developer", "2015-12-18");

        employees = App.searchEmployees(employees, "Jac");
        employees = App.sortEmployees(employees);

        assertEquals("Jacquelyn", employees[0].getFirstName());
        assertEquals("Jake", employees[1].getFirstName());
    }
}
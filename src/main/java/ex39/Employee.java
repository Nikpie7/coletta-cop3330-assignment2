package ex39;

public class Employee {
    private final String firstName, lastName, position;
    private String separationDate;

    public Employee(String first, String last, String pos) {
        firstName = first;
        lastName = last;
        position = pos;
        separationDate = " ";
    }

    public Employee(String first, String last, String pos, String sep) {
        firstName = first;
        lastName = last;
        position = pos;
        separationDate = sep;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPosition()
    {
        return position;
    }

    public String getSeparationDate()
    {
        return separationDate;
    }
}

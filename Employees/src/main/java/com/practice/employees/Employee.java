package com.practice.employees;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Abstract classes can only serve as super classes, cannot create instances of them (cannot be instantiated)
public abstract class Employee implements IEmployee {
    protected final NumberFormat salaryFormat = NumberFormat.getCurrencyInstance();
    protected final DateTimeFormatter dtFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
    private static final String REGEX = "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)\\})?";
//  "(?<lastName>\\w+),\\s*(?<firstName>\\w+),\\s*(?<dob>\\d{1,2}/\\d{1,2}/\\d{4}),\\s*(?<role>\\w+)(?:,\\s*\\{(?<details>.*)})?\\n"; (old regex)
    public static final Pattern PAT = Pattern.compile(REGEX);
    protected String lastName;
    protected String firstName;
    protected LocalDate dob;
    protected final Matcher mat;

    protected Employee() {
        mat = null;
        lastName = "N/A";
        firstName = "N/A";
        dob = null;
    }

    protected Employee(String personText) {
        mat = Employee.PAT.matcher(personText);
        if(mat.find()) {
            this.lastName = mat.group("lastName");
            this.firstName = mat.group("firstName");
            this.dob = LocalDate.from(dtFormatter.parse(mat.group("dob")));
        }
    }

    public static final IEmployee createEmployee(String employeeText){
        Matcher mat = Employee.PAT.matcher(employeeText);
        if(mat.find()) {
            return switch (mat.group("role")) {
                case "Programmer" -> new Programmer(employeeText);
                case "Manager" -> new Manager(employeeText);
                case "Analyst" -> new Analyst(employeeText);
                case "CEO" -> new CEO(employeeText);
                default -> new DummyEmployee(); // Lambda expression
            };
        }
        else{
            return new DummyEmployee();
            // Could also use lambda expression here: () -> 0;
        }
    }

    // All methods in an interface are considered to be public
   public abstract int getSalary(); // Subclasses must implement this method

    public double getBonus(){
        return getSalary() * 1.10;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return String.format("%s, %s: %s - %s%n", lastName, firstName, salaryFormat.format(getSalary()), salaryFormat.format(getBonus()));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return lastName.equals(employee.lastName) && firstName.equals(employee.firstName) && dob.equals(employee.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, dob);
    }

    private static final class DummyEmployee extends Employee{
        @Override
        public int getSalary() {
            return 0;
        }
    }

    @Override
    public int compareTo(IEmployee o) {
        Employee other = (Employee) o;
        return this.lastName.compareTo(other.lastName);
    }
}

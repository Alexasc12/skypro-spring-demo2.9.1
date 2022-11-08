package pro.sky.skyprospringdemotwo.model;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;
import java.util.Objects;
// Работник Класс
public class Employee {
    private final String firstName;
    private final String lastName;
    private final int department;
    private final Double salary;
    public int getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }


//Конструктор

    public Employee(String firstName, String lastName ,int department, Double salary) {
        this.firstName = StringUtils.capitalize(firstName.toLowerCase());
        this.lastName = StringUtils.capitalize(lastName.toLowerCase());
        this.department = department;
        this.salary = salary;
    }




    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}

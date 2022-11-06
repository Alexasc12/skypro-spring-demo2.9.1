package pro.sky.skyprospringdemotwo.service;

import pro.sky.skyprospringdemotwo.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName, int department, Double salary);



    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Employee remove(String firstName, String lastName, int department, Double salary);

    Employee find(String firstName, String lastName, int department, Double salary);

    Collection<Employee> findAll();


}

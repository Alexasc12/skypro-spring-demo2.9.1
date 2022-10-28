package pro.sky.skyprospringdemotwo.service;


import pro.sky.skyprospringdemotwo.exception.EmployeeNotFoundException;
import pro.sky.skyprospringdemotwo.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartmentService {
    EmployeeServiceImpl employeeService;

    public DepartmentService(EmployeeServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    public Employee findEmployeeWithMaxSalaryFromDepartment(int department) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == department)
                .max(Comparator.comparingDouble(Employee::getDepartment))
                .orElseThrow(EmployeeNotFoundException::new);

    }
    public Employee findEmployeeWithMinSalaryFromDepartment(int department) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == department)
                .min(Comparator.comparingDouble(Employee::getDepartment))
                .orElseThrow(EmployeeNotFoundException::new);
    }

    public List<Employee> findEmployeeWithDepartment(int department) {
        return employeeService.getAll().stream()
                .filter(employee -> employee.getDepartment() == department)
                .collect(Collectors.toList());

    }
    public Map<Integer,List<Employee>> findEmployees(int department) {
        return employeeService.getAll().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));


    }



}
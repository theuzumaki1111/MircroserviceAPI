package io.getarrays.apiapplication.service;

import io.getarrays.apiapplication.model.Employee;

import java.util.list;
public class EmployeeService {
    // Save an employee
    void addEmployee(Employee employee);
    //Get employees
    List<Employee> getAllEmployees();
    //Get one employee
    Employee findBYId(Integer id);
    // Update employee
    void updateEmployee(Employee employee);
    // Delete Employee
    Boolean.deleteById(Integer id);

}

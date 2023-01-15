package com.greatlearning.assignment1.service;

import java.util.List;

import com.greatlearning.assignment1.entity.Employee;

public interface EmployeeService {

	List<Employee> findAllEmployees();

	Employee findEmployeeById(int id);

	Employee addEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

	void deleteEmployeeById(int id);

}

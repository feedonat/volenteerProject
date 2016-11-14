package mum.edu.volunteer.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mum.edu.volunteer.domain.Employee;


public interface EmployeeService {

	public void save(Employee employee);
	public List<Employee> findAll();
	public Employee getEmployeeByNumber (int employeeNumber);
	public Employee findByName(String resourceName);
	
}
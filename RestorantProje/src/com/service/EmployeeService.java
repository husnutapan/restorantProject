package com.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.model.Employee;

public interface EmployeeService {
	public List<Employee> findAllEmployees();

	public void saveEmployee(Employee employee);

	public void deleteEmployeeBySssn(String ssn);

	public Employee findById(int id);

	public Employee findEmployeeBySsn(String ssn);

	public boolean isEmployeeSsnUnique(Integer id, String ssn);

	public Employee getEmployeeById(long id);
	
	public void updateEmployeeById(Employee class1,long id);

	public void  deleteEmployee(long id);
}

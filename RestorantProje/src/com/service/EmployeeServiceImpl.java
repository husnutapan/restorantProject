package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDAO;
import com.model.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public List<Employee> findAllEmployees() {
		return employeeDAO.findAllEmployees();
	}

	@Override
	public void saveEmployee(Employee employee) {
			employeeDAO.saveEmployee(employee);
	}

	@Override
	public void deleteEmployeeBySssn(String ssn) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee findById(int id) {
		return employeeDAO.findById(id);
	}

	@Override
	public Employee findEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmployeeSsnUnique(Integer id, String ssn) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee getEmployeeById(long id) {
		return employeeDAO.getEmployeeById(id);
		
	}

	@Override
	public void updateEmployeeById(Employee class1, long id) {
		 employeeDAO.updateEmployeeById(class1,id);
	}

	@Override
	public void deleteEmployee( long id) {
		 employeeDAO.deleteEmployee(id);
	}
}

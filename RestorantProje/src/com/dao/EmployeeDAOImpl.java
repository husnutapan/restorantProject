package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDAOImpl extends AbstractDao<Integer, Employee> implements EmployeeDAO, Serializable {

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployees() {
		Criteria criteria = createEntityCriteria();
		return (List<Employee>) criteria.list();
	}

	@Override
	public void saveEmployee(Employee employee) {
		persist(employee);
	}

	@Override
	public void deleteEmployeeBySssn(String ssn) {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return null;
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
		return getByKey((int) id);
	}

	@Override
	public void updateEmployeeById(Employee employee, long id) {
			merge(employee);
	}

	@Override
	public void  deleteEmployee(long id) {
		 delete(getByKey((int)id));
	}

}

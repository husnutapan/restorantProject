package com.dao;

import java.util.List;

import com.model.Person;

public interface PersonDAO {
	
	public List<Person> findAllPersons();

	public void saveEmployee(Person person);

	public Person findById(int id);

	public Person findEmployeeBySsn(String ssn);

}

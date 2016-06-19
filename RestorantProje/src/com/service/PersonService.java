package com.service;

import java.util.List;
import com.model.Person;
public interface PersonService {
	public List<Person> findAllPersons();

	public void saveEmployee(Person person);

	public Person findById(int id);

	public Person findEmployeeBySsn(String ssn);

}

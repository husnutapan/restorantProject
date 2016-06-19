package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

import com.model.Employee;
import com.model.Person;

public class PersonDAOImpl  extends AbstractDao<Integer, Person>  implements PersonDAO,Serializable{

	@Override
	public List<Person> findAllPersons() {
		Criteria criteria = createEntityCriteria();
		return (List<Person>) criteria.list();
	}

	@Override
	public void saveEmployee(Person person) {
		persist(person);
	}

	@Override
	public Person findById(int id) {
		
		return null;
	}

	@Override
	public Person findEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

}

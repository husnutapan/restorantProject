package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.model.Employee;
import com.service.EmployeeService;

@RestController
public class AppController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> listAllUsers() {
		List<Employee> employees = employeeService.findAllEmployees();
		if (employees.isEmpty()) {
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
	}

	@RequestMapping(value = "/user/", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody Employee employee, UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + employee.getName());

		employeeService.saveEmployee(employee);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(employee.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Employee getUser(@PathVariable("id") long id) {
		return employeeService.getEmployeeById(id);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
	public void updateUser(@PathVariable("id") long id, @RequestBody Employee employee) {
		employeeService.updateEmployeeById(employee, id);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable("id") long id) {
		employeeService.deleteEmployee(id);
	}

	@RequestMapping(value = "/user/", method = RequestMethod.DELETE)
	public ResponseEntity<Employee> deleteAllUsers() {
		System.out.println("Deleting All Users");
		return null;
	}
}

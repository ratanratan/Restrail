package com.sathya.as;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	 	@Autowired
	    private EmployeeRepository employeeRepository;

	    public Employee  saveUser(Employee user) {
	        return employeeRepository.save(user);
	    }

	    public List<Employee> getAllUsers() {
	        return employeeRepository.findAll();
	    }
	    
}

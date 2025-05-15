package com.sathya.as;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emps")
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    private EmployeeService userService;

    @Autowired
    EmployeeRepository employeeRepository;
    
    // POST: Register a new user
    @PostMapping("/register")
    public Employee registerUser(@RequestBody Employee user) {
        return userService.saveUser(user);
    }

    // GET: Retrieve all users
    @GetMapping("/all")
    public List<Employee> getAllUsers() {
        return userService.getAllUsers();
    }
    
    
    
    @DeleteMapping("delete/{id}")
    public String deleteById(@PathVariable("id") Long id)
    {
    	employeeRepository.deleteById(id);
    	return "data deleted";
    }
    
    
    
    
}
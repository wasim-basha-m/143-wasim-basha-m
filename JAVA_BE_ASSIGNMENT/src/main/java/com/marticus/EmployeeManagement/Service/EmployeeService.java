package com.marticus.EmployeeManagement.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.EmployeeManagement.Entity.Employee;
import com.marticus.EmployeeManagement.Entity.User;
import com.marticus.EmployeeManagement.Repository.EmployeeRepository;
import com.marticus.EmployeeManagement.Repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private UserRepository userRepository;

    //TO FIND ALL EMPLOYEES
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    
    public Optional<Employee> findById(long id) {
        return employeeRepository.findById(id);
    }
    
    //TO SAVE THE EMPLOYEE
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    
    //TO UPDATE THE EMPLOYEE
    public Employee updateEmployee(long id, Employee employee) {
        Employee updatedEmployee = employeeRepository.findById(id).orElse(null);
        updatedEmployee.setEmployeeId(employee.getEmployeeId());
        updatedEmployee.setEmployeeName(employee.getEmployeeName());
        updatedEmployee.setSalary(employee.getSalary());
        updatedEmployee.setAge(employee.getAge());
        updatedEmployee.setAadhar(employee.getAadhar());
        updatedEmployee.setDepartment(employee.getDepartment());
        return employeeRepository.save(updatedEmployee);
    }
    
    //TO DELETE THE EMPLOYEE
    public void deleteById(long id) {
        employeeRepository.deleteById(id);
    }
    
    //TO SEARCH THE EMPLOYEE BY HIS NAME
    public List<Employee> findByEmployeeName(String employeeName) {
		// TODO Auto-generated method stub
		return employeeRepository.findEmployeeByEmployeeNameLike(employeeName);
	}
	
    //IT USED TO AUTHENTICATE THE USER WHETHER THEY CAN ABLE TO ACCESS EMPLOYEE'S DATABASE OR NOT
    public boolean authenticateUser(User user) {
		User user1 = userRepository.findUserByUserNameAndPassword(user.getUserName(), user.getPassword());
		if (user1 != null) {
			return true;
		}
		return false;

	}

	
}

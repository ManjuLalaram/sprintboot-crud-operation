package com.sample.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.entity.Employee;
import com.sample.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public void addEmployee(Employee emp) {
		Employee count =   employeeRepository.save(emp);
		
		System.out.println("Saved data successfully!! ::"+count);
	}
	
	public List<Employee> getAllEmployee(){
		List<Employee>list = employeeRepository.findAll();
		return list;
	}
	
	public Employee getById(int id) {
		Optional<Employee>optional =  employeeRepository.findById(id);
		Employee emp = optional.orElse(null);
		return emp;
	}
	
	public void updateContactNoById(int id, String contactNo) {
		Optional<Employee>optional = employeeRepository.findById(id);
		Employee emp = optional.orElse(null);
		
		if(emp != null) {
			emp.setContactNo(contactNo);
			employeeRepository.save(emp);
		}else {
			System.out.println("Record does not exits for this id : "+id);
		}
		
	}
	
	public void deleteById(int id) {
		Optional<Employee>optional = employeeRepository.findById(id);
		
		Employee employee = optional.orElse(null);
		
		if(employee!=null) {
			employeeRepository.deleteById(id);
		}else {
			System.out.println("Record does not exits for this id : "+id);
		}
	}
}

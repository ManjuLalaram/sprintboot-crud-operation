package com.sample.demo;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sample.demo.entity.Employee;
import com.sample.demo.service.EmployeeService;

import lombok.extern.log4j.Log4j2;


@Log4j2
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.out.println("====================All employee ======================");
		
		List<Employee>list = employeeService.getAllEmployee();
		
		for(Employee item:list) {
			System.out.println("Employee :: "+item);
		}
		
		
		System.out.println("================emp by id=================");
		Employee employee = employeeService.getById(101);
		
		System.out.println("Employee get by id : "+101+" and employee : "+employee);
		
		
		System.out.println("============add employee ====================");
		
		Employee emp = new Employee();
		emp.setId(108);
		emp.setName("Manju");
		emp.setContactNo("722404");
		emp.setDoj(new Date());
		
		employeeService.addEmployee(emp);
		
		
		System.out.println("=============after add new employee all emp =====================");
		
        List<Employee>list2 = employeeService.getAllEmployee();
		
		for(Employee item:list2) {
			System.out.println("Employee :: "+item);
		}
		
		
		System.out.println("===================update by id ===============================");
		
		employeeService.updateContactNoById(108, "8085670832");
		
        Employee employee1 = employeeService.getById(108);
		
		System.out.println("Employee get by id : "+108+" and employee : "+employee1);
		
		
		
		System.out.println("========================delete by id ==============================");
		
		employeeService.deleteById(108);
		
		
		
		System.out.println("==========================after delete by id ======================");
		
		
        List<Employee>list1 = employeeService.getAllEmployee();
		
		for(Employee item:list1) {
			System.out.println("Employee :: "+item);
		}
		
		
		System.out.println("=====================end ================================");
//		System.out.println("Hello World!!!");
	}

}

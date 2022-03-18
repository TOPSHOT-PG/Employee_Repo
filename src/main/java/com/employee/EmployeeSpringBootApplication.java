package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;

import com.employee.service.EmployeeServiceImpl;

@SpringBootApplication
public class EmployeeSpringBootApplication {

	public static void main(String[] args) {
		EmployeeServiceImpl service = null;
		
		AbstractApplicationContext context = (AbstractApplicationContext) 
				SpringApplication.run(EmployeeSpringBootApplication.class, args);
		
		service = (EmployeeServiceImpl)context.getBean("employeeService");
		System.out.println(service.createEmployee());
		
		System.out.println(service.fetchEmployee());
	}

}

package com.employee.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService{
	
	@Value("1")
	private int empID;
	
	@Value("Pratik Gaurav")
	private String empName;
	
	@Value("DEV")
	private String empDesignation;
	
	public String createEmployee() {
		return "New Employee Is Created Successfully";
	}
	
	public String fetchEmployee() {
		
		return "Employee Details are: "
				+ "EmpID : "+ empID + "\nEmpName : " + empName + "\nEmpDesignation : " + empDesignation;
	}

}

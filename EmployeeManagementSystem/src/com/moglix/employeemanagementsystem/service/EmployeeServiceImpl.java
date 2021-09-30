package com.moglix.employeemanagementsystem.service;

import com.moglix.employeemanagementsystem.dto.Employee;

public interface EmployeeServiceImpl {


	public String addEmpployee(Employee employee);
	public String updateEmployee(String id, Employee employee);
	public Employee getEmployeeById(String id);
	public Employee[] getEmployees();
	public String deleteEmployeeById(String id);
	public void deleteAllEmployees();
	

}

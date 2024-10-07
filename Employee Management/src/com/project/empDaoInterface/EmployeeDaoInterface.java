package com.project.empDaoInterface;

import com.project.employeeApp.Employee;

public interface EmployeeDaoInterface {
	
	//create employee
	public void createEmployee(Employee emp);
	//show all employee
	public void showAllEmployee();
	//show employee based on id
	//user kitta iruntu input vangarom so parameter la variable set pananu
	public void showAllEmployeeBasedOnId(int id);
	
	//update employee
	public void updateEmployee(int id,String name);
	
	//delete employee
	public void deleteEmployee(int id);
}

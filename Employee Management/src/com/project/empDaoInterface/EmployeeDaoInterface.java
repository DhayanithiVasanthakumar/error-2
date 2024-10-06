package com.project.empDaoInterface;

public interface EmployeeDaoInterface {
	
	//create employee
	public void createEmployee();
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

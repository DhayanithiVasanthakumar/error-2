package com.project.empDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.project.DBConnection.DataBaseConnection;
import com.project.empDaoInterface.EmployeeDaoInterface;
import com.project.employeeApp.Employee;

public class EmployeeDao implements EmployeeDaoInterface{

	Connection con;
	
	@Override
	public void createEmployee(Employee em) {
		con=DataBaseConnection.createDBConnection();
		String query="INSERT INTO emp_details VALUES(?,?,?,?);";
		
		try {
			PreparedStatement pst=con.prepareStatement(query);
			
			pst.setInt(1, em.getID());
			pst.setString(2, em.getName());
			pst.setDouble(3, em.getSalary());
			pst.setInt(4, em.getAge());
			
			int count=pst.executeUpdate();
			if(count!=0) {
				System.out.println("Employee inserted sucessfully...");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void showAllEmployee() {
		
		
	}

	@Override
	public void showAllEmployeeBasedOnId(int id) {
		
		
	}

	@Override
	public void updateEmployee(int id, String name) {
		
		
	}

	@Override
	public void deleteEmployee(int id) {
		
		
	}

	
	
}

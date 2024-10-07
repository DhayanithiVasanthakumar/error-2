package com.project.empDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		con=DataBaseConnection.createDBConnection();
		String query="SELECT * FROM emp_details;";
		
		System.out.println("Employee Details:");
		System.out.println("--------------------------------------------------------");
		
		System.out.format("%s\t%s\t%s\t\t%s\n","ID","NAME","SALARY","AGE");
		System.out.println("--------------------------------------------------------");
		
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next()) {
				/*
				 * %d -> for int
				 * %s -> for String
				 * %f -> for double
				 */
				System.out.format("%d\t%s\t%f\t%d\n",
						rs.getInt(1),
						rs.getString(2),
						rs.getDouble(3),
						rs.getInt(4)
						);
				System.out.println("--------------------------------------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
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

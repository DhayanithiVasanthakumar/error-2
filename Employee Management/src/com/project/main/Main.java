package com.project.main;

import java.util.Scanner;

import com.project.empDao.EmployeeDao;
import com.project.empDaoInterface.EmployeeDaoInterface;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * for access methods
		 */
		EmployeeDaoInterface dao=new EmployeeDao() ;
			
	
		
		System.out.println("Employee Management System");
		Scanner in=new Scanner(System.in);
		
		do {
			System.out.println("1.Add Employee\n2.Show all Employees\n3.Show employee based on id\n4.update employee\n5.Delete employee\n6.Exit");
			
			int choice=in.nextInt();
			
			switch(choice) {
			case 1:
				dao.createEmployee();
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				System.out.println("Thankyou for using application...");
				System.exit(0);
				break;
			default:
				System.out.println("please enter valid choice!");
			}
			
			
		}while(true);
	}

}

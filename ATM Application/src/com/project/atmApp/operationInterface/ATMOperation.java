package com.project.atmApp.operationInterface;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.project.atmApp.atm.ATM;
import com.project.atmApp.database.DataBaseConnection;

public class ATMOperation implements ATMOperationInterface {

	Scanner input = new Scanner(System.in);

	/*
	 * ATM class la irukaratha access pananum so antha class ku inga obj create
	 * pananu
	 */

	ATM atmobj = new ATM();

	// for mini statement
	Map<Double, String> ministmt = new HashMap<>();

	@Override
	public void viewBalance() {
		System.out.println("Available balance: " + atmobj.getBalance());

	}

	@Override
	public void withDrawAmount(double withDrawAmount) {

		if (withDrawAmount % 100 == 0 || withDrawAmount % 200 == 0 || withDrawAmount % 500 == 0) {
			if (withDrawAmount <= atmobj.getBalance()) {
				System.out.println("Collect your cash" + withDrawAmount);

				// for mini stmt
				ministmt.put(withDrawAmount, "Amount withdrawn");

				// to check balance
				atmobj.setBalance(atmobj.getBalance() - withDrawAmount);
				viewBalance();
			} else {
				System.out.println("Insuffuint balance");
			}
		} else {
			System.out.println("Please enter amount multiply of 100,200,500");
		}

	}

	@Override
	public void depositAmount(double depositAmount) {

		// for mini stmt
		ministmt.put(depositAmount, "Amount deposited");

		System.out.println(depositAmount + " Amount deposit sucessfully..");

		// atmobj.getBalance() -> already irukara amount + depositAmount -> current
		// amount.
		atmobj.setBalance(atmobj.getBalance() + depositAmount);

		viewBalance();

	}

	@Override
	public void viewMiniStatement() {

		for (Map.Entry<Double, String> m : ministmt.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

	@Override
	public boolean insertCustomerID(ATM addCusomerID) {

		boolean flag = false;

		try {
			Connection con = DataBaseConnection.createConnection();

			String query = "INSERT INTO atm_detail(customer_id) VALUES(?);";

			PreparedStatement pst = con.prepareStatement(query);

			pst.setInt(1, addCusomerID.getCustomerID());

			pst.executeUpdate();

			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;

	}

	@Override
	public boolean deleteCustomerID(int delCusID) {

		boolean flag = false;

		try {
			Connection con = DataBaseConnection.createConnection();

			String query = "DELETE FROM atm_detail WHERE customer_id=" + delCusID;

			PreparedStatement pst = con.prepareStatement(query);

			pst.executeUpdate();

			flag = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;

	}

}

package com.project.atmApp.operationInterface;

import com.project.atmApp.atm.ATM;

public interface ATMOperationInterface {

	public void viewBalance();

	public void withDrawAmount(double withDrawAmount);

	public void depositAmount(double depositAmount);

	public void viewMiniStatement();

	public boolean insertCustomerID(ATM atmdetails);

	public boolean deleteCustomerID(int delCusID);

}

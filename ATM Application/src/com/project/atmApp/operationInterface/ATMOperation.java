package com.project.atmApp.operationInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.project.atmApp.atm.ATM;

public class ATMOperation implements ATMOperationInterface{

	Scanner input=new Scanner(System.in); 
	
	 
	
	
	/*
	 * ATM class la irukaratha access pananum so antha class ku inga obj create pananu
	 */
	
	ATM atmobj=new ATM();
	
	//for mini statement
	Map<Double,String> ministmt=new HashMap<>();
	
	

	
	
	
	

	
	
	
	
	
	
	@Override
	public void viewBalance() {
		System.out.println("Available balance: "+atmobj.getBalance());
		
		
	}

	
	
	@Override
	public void withDrawAmount(double withDrawAmount) {
		
		if(withDrawAmount %100==0||withDrawAmount %200==0||withDrawAmount %500==0) {
			if(withDrawAmount<=atmobj.getBalance()) {
				System.out.println("Collect your cash"+withDrawAmount);
				
				//for mini stmt 
				ministmt.put(withDrawAmount, "Amount withdrawn");
				
				//to check balance
				atmobj.setBalance(atmobj.getBalance()-withDrawAmount);
				viewBalance();
			}
			else {
				System.out.println("Insuffuint balance");
			}
		}
		else {
			System.out.println("Please enter amount multiply of 100,200,500");
		}
		
		
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		
		//for mini stmt 
		ministmt.put(depositAmount, "Amount deposited");
		
		System.out.println(depositAmount+" Amount deposit sucessfully..");
	
		
		//atmobj.getBalance() -> already irukara amount + depositAmount -> current amount.
		atmobj.setBalance(atmobj.getBalance()+depositAmount);
		
		viewBalance();
		
		
		
	}

	@Override
	public void viewMiniStatement() {
		
		for(Map.Entry<Double,String> m:ministmt.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

	





}

package com.project.atmApp.main;

import java.util.Scanner;

import com.project.atmApp.atm.ATM;
import com.project.atmApp.operationInterface.ATMOperation;
import com.project.atmApp.operationInterface.ATMOperationInterface;

public class Main {
	
	
	
	public static void main(String[]args) {
		
		/*
		 * create object dynamic binding -> interface
		 */
		ATMOperationInterface op=new ATMOperation();
		
		
		
		/*
		 * inga random password change pani namaku yetha password vacha maari inga setv pananum
		 * 
		 *refer EmailApp class in EmailAdministrator project.
		 */
		
		int atmNum=12345;
		int pin=123;
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Welcome to ATM mechine");
		
		
		
		
		
		System.out.print("Enter ATM number: ");
		int atmNumber=input.nextInt();
		
		System.out.println("Enter ATM pin: ");
		int atmPin=input.nextInt();
		
		
		if((atmNumber==atmNum)&&(atmPin==pin)) {
			
			
			while(true) {
				System.out.println("1.Available Balance\n2.deposit Amount\n3.Withdraw Amount\n4.Mini Statement\n5.Exit from application");
				
				System.out.println("Enter choice: ");
				
				int choice=input.nextInt();
			
				/*
				 * try switch case insted of using if else
				 */
				if(choice==1) {
					op.viewBalance();
				}
				else if(choice==2) {
					System.out.println("Enter amount to deposit: ");
					double depositInput=input.nextDouble();
					op.depositAmount(depositInput);
				}
				else if(choice==3) {
					System.out.println("Enter amount to withdraw");
					double withdraw=input.nextDouble();
					op.withDrawAmount(withdraw); 
				}
				else if(choice==4) {
					op.viewMiniStatement();
				}
				else if(choice==5) {
					System.out.println("Collect your ATM card\n Thankyou for using application");
					System.exit(0);
				}
				else {
					System.out.println("Invalid choice Please enter correct choice");
				}
				
			
			}
		}
		else {
			System.out.println("Invalid ATM number or pin");
			System.exit(0);
		}
		
	}
}

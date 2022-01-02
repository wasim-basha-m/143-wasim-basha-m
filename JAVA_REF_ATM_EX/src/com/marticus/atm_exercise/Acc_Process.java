package com.marticus.atm_exercise;

import java.util.Scanner;

public class Acc_Process  {
	int accountNumber = 12345678; // stores the account number
	int balance = 10000; // default balance to check whether the program is working

	Scanner sc = new Scanner(System.in);
	public void accountNumber() {
		System.out.println("Please Enter the Account Number : ");
		int accNum = sc.nextInt();

		if(accNum==accountNumber) {
			while(true) {
				System.out.println("Select the number to perform operation");
				System.out.println("Choose 1 for Withdraw Money");
				System.out.println("Choose 2 for Deposit Money");

				int choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Enter the amount to be withdrawn : ");
					int withdraw = sc.nextInt();
					if(balance>=withdraw) {
						balance = balance-withdraw;
						System.out.println("Transaction Successfull...!");
						System.out.println("Please collect your money...");
						System.out.println("Available balance is : "+ balance);
						System.out.println("");
					}
					else {
						System.out.println("Insufficient Balance");
					}
					break;
				case 2:
					System.out.println("Enter money to be deposited:");
					int deposit=sc.nextInt();

					deposit=balance + deposit;
					System.out.println("Your amount has been deposited successfully...!");
					System.out.println("Available balance : "+deposit);
					break;
				}
				System.out.println("Thank You for using ATM...! ");
				System.exit(0);

			}

		}
		else {
			System.out.println("Invalid Account Number");
			accountNumber();
		}
	}

}
package com.marticus.atm_exercise;

import java.util.Scanner;

public class Atm_Ex{
public static void main(String[] args) {
		System.out.println("Welcome to ATM Assignment !!");
		System.out.println("");
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Select Account:");
		System.out.println("Press 1 for Saving Account");
		System.out.println("Press 2 for Current Account");
		System.out.println("Press any key to EXIT");
		while(true) {
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				Acc_Process ac = new Acc_Process();
				ac.accountNumber();
				break;
			case 2:
				Acc_Process ac1 = new Acc_Process();
				ac1.accountNumber();
				break;
			}
				System.out.println("Thank You for using ATM!");
				
			}
		}
	}
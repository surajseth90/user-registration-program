package com.bridgelabz.userregistration;
import java.util.Scanner;

public class Password {
	private static final String passwordCondition = "[A-Za-z]{8,}";
		
	public static String validPassword() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Password : ");
		String password = scanner.nextLine();
		CheckCondition.checkCondition(password,passwordCondition);
		if(CheckCondition.checkCondition(password,passwordCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format ,eg. minimum 8 characters ");
			Password.validPassword();
		}
		return password;
	}	
}

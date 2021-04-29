package com.bridgelabz.userregistration;

import java.util.Scanner;

public class FirstName {
	private static final String firstNameCondition = "[A-Z][a-z]{2,}";
	
	public static String validFirstName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String firstName = scanner.nextLine();
		CheckCondition.checkCondition(firstName,firstNameCondition);
		if(CheckCondition.checkCondition(firstName,firstNameCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) "+"\n");
			FirstName.validFirstName();
			}
		return firstName;
	}

}

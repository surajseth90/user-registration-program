package com.bridgelabz.userregistration;
import java.util.Scanner;

public class LastName {
	private static final String lastNameCondition = "[A-Z][a-z]{2,}";
	
	public static String validLastName() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your last name : ");
		String lastName = scanner.nextLine();
		CheckCondition.checkCondition(lastName,lastNameCondition);
		if(CheckCondition.checkCondition(lastName,lastNameCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) " +"\n");
			LastName.validLastName();
		}
		return lastNameCondition;
	}
}

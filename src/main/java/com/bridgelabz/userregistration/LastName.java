package com.bridgelabz.userregistration;

public class LastName {
	private static final String lastNameCondition = "[A-Z][a-z]{2,}";
	
	public static boolean validLastName(String lastName) {
		if(CheckCondition.checkCondition(lastName,lastNameCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) " +"\n");
			UserRegistrationMain.validLastName();
		}
		return CheckCondition.checkCondition(lastName,lastNameCondition);
	}
}

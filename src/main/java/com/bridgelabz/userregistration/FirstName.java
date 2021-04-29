package com.bridgelabz.userregistration;

public class FirstName {
	private static final String firstNameCondition = "[A-Z][a-z]{2,}";
	
	public static boolean validFirstName(String firstName) {
		if(CheckCondition.checkCondition(firstName,firstNameCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) "+"\n");
			UserRegistrationMain.validFirstName();
			}
		return CheckCondition.checkCondition(firstName,firstNameCondition);
	}

}

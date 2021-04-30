package com.bridgelabz.userregistration;

import com.bridgelabz.userregistration.exception.LastNameException;

public class LastName {
	private static final String lastNameCondition = "[A-Z][a-z]{2,}";
	
	public static boolean validLastName(String lastName) throws LastNameException{
		try {
		if(CheckCondition.checkCondition(lastName,lastNameCondition))
			System.out.println("OK!");
		else 
			throw new LastNameException("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) " +"\n");	
		}catch(LastNameException e) {
			System.out.println(e.getMessage());
			UserRegistrationMain.validLastName();
		}
		return CheckCondition.checkCondition(lastName,lastNameCondition);
	}
}

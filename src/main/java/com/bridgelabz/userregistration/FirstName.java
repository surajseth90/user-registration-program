package com.bridgelabz.userregistration;

import com.bridgelabz.userregistration.exception.FirstNameException;

public class FirstName {
	private static final String firstNameCondition = "[A-Z][a-z]{2,}";

	
	public static boolean validFirstName(String firstName) throws FirstNameException  {
		try {
		if(CheckCondition.checkCondition(firstName,firstNameCondition))
			System.out.println("OK!");
		else {
			throw new FirstNameException("Invalid Input : Please Enter in a proper format "+"\n"
					+ "( 1. Name must have only charater values," + "\n"
					+ "  2. Name must have minimum 3 letters," + "\n"
					+ "  3. First letter must be Capital ) "+"\n");
			}
		}catch(FirstNameException e){
			System.out.println(e.getMessage());
			UserRegistrationMain.validFirstName();		
		}
		return CheckCondition.checkCondition(firstName,firstNameCondition);
	}
}

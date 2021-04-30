package com.bridgelabz.userregistration;

import com.bridgelabz.userregistration.exception.EmailException;

public class Email {
	private static final String emailCondition = "[a-z0-9]{3,}([a-z\\.\\+\\-\\_]{3,})?[@][a-z]{2,}[a-z.]{2,}([a-z.]{2,})?";
	
	public static boolean validEmail(String email) throws EmailException {
		try {
		if(CheckCondition.checkCondition(email,emailCondition))
			System.out.println("OK!");
		else 
			throw new EmailException("Invalid Input : Please Enter in a proper format : eg. abc.xyz@bl.co.in");
		}catch (EmailException e) {
			System.out.println(e.getMessage());
			UserRegistrationMain.validEmail();
		}
		return CheckCondition.checkCondition(email,emailCondition);
	}
}

package com.bridgelabz.userregistration;

public class Email {
	private static final String emailCondition = "[a-z0-9]{3,}([a-z\\.\\+\\-\\_]{3,})?[@][a-z]{2,}[a-z.]{2,}([a-z.]{2,})?";
	
	public static boolean validEmail(String email) {
		if(CheckCondition.checkCondition(email,emailCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format : eg. abc.xyz@bl.co.in");
			UserRegistrationMain.validEmail();
			}
		return CheckCondition.checkCondition(email,emailCondition);
	}
}

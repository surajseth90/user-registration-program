package com.bridgelabz.userregistration;

import com.bridgelabz.userregistration.exception.PasswordException;

public class Password {
	private static final String passwordCondition = "(?=.*\\d)(?=.*[A-Z])[A-Za-z0-9]{7,}([\\$\\@\\!\\%\\*\\?\\=\\+\\-\\_\\&]{1})";
		
	public static boolean validPassword(String password) throws PasswordException {
		try {
		if(CheckCondition.checkCondition(password,passwordCondition))
			System.out.println("OK!");
		else 
			throw new PasswordException("Invalid Input : Please Enter in a proper format "+"\n"
					+ " minimum 8 characters ,"+"\n"
					+ " atleast 1 upper case character , "+"\n"
					+ " atleast 1 numeric number ");
		}catch (PasswordException e) {
			System.out.println(e.getMessage());
			UserRegistrationMain.validPassword();
		}
		return CheckCondition.checkCondition(password,passwordCondition);
	}	
}

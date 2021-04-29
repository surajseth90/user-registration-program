package com.bridgelabz.userregistration;

public class Password {
	private static final String passwordCondition = "(?=.*\\d)(?=.*[A-Z])[A-Za-z0-9]{7,}([\\$\\@\\!\\%\\*\\?\\=\\+\\-\\_\\&]{1})";
		
	public static boolean validPassword(String password) {
		if(CheckCondition.checkCondition(password,passwordCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format "+"\n"
					+ " minimum 8 characters ,"+"\n"
					+ " atleast 1 upper case character , "+"\n"
					+ " atleast 1 numeric number ");
			UserRegistrationMain.validPassword();
			}
		return CheckCondition.checkCondition(password,passwordCondition);
	}	
}

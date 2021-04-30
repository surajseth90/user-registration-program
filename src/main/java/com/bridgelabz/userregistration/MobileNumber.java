package com.bridgelabz.userregistration;

import com.bridgelabz.userregistration.exception.MobileNumberException;

public class MobileNumber {
	private static final String mobileNumberCondition = "[0-9]{2}\\s[0-9]{10}";
	
	public static boolean validMobileNumber(String mobileNumber) throws MobileNumberException{
		try {
		if(CheckCondition.checkCondition(mobileNumber,mobileNumberCondition))
			System.out.println("OK!");
		else 
			throw new MobileNumberException("Invalid Input : Please Enter in a proper format ,eg. 91 1111111111 ");
		}catch (MobileNumberException e){
			System.out.println(e.getMessage());
			UserRegistrationMain.validMobileName();
		}
		return CheckCondition.checkCondition(mobileNumber,mobileNumberCondition);
	}	
}
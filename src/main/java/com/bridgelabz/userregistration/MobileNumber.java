package com.bridgelabz.userregistration;

public class MobileNumber {
	private static final String mobileNumberCondition = "[0-9]{2}\\s[0-9]{10}";
	
	public static boolean validMobileNumber(String mobileNumber) {
		if(CheckCondition.checkCondition(mobileNumber,mobileNumberCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format ,eg. 91 1111111111 ");
			UserRegistrationMain.validMobileName();
			}
		return CheckCondition.checkCondition(mobileNumber,mobileNumberCondition);
	}	
}
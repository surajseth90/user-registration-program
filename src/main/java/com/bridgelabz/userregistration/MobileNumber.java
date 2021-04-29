package com.bridgelabz.userregistration;
import java.util.Scanner;

public class MobileNumber {
	private static final String mobileNumberCondition = "[0-9]{2}\\s[0-9]{10}";
	
	public static String validMobileNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Mobile Number : ");
		String mobileNumber = scanner.nextLine();
		CheckCondition.checkCondition(mobileNumber,mobileNumberCondition);
		if(CheckCondition.checkCondition(mobileNumber,mobileNumberCondition))
			System.out.println();
		else {
			System.out.println("Invalid Input : Please Enter in a proper format ,eg. 91 1111111111 ");
			MobileNumber.validMobileNumber();
			}
		return mobileNumber;
	}	
}
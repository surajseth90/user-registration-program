package com.bridgelabz.userregistration;
import java.util.Scanner;

public class UserRegistrationMain {

	public static void main(String[] args) {
		
		UserRegistrationMain.validFirstName();
		UserRegistrationMain.validLastName();
		UserRegistrationMain.validEmail();
		UserRegistrationMain.validMobileName();
		UserRegistrationMain.validPassword();	
	}
	
	public static void validFirstName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String firstName = scanner.nextLine();
		FirstName.validFirstName(firstName);
	}
	
	public static void validLastName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your last name : ");
		String lastName = scanner.nextLine();
		LastName.validLastName(lastName);
	}
	public static void validEmail() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Email ID : ");
		String email = scanner.nextLine();
		Email.validEmail(email);
	}
	public static void validMobileName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Mobile Number : ");
		String mobileNumber = scanner.nextLine();
		MobileNumber.validMobileNumber(mobileNumber);
	}
	
	public static void validPassword() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Password : ");
		String password = scanner.nextLine();
		Password.validPassword(password);
	}
}
	


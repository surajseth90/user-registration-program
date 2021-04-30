package com.bridgelabz.userregistration;
import java.util.Scanner;
import com.bridgelabz.userregistration.exception.EmailException;
import com.bridgelabz.userregistration.exception.FirstNameException;
import com.bridgelabz.userregistration.exception.LastNameException;
import com.bridgelabz.userregistration.exception.MobileNumberException;
import com.bridgelabz.userregistration.exception.PasswordException;

public class UserRegistrationMain {

	public static void main(String[] args) throws Exception {
		UserRegistrationMain.validFirstName();
		UserRegistrationMain.validLastName();
		UserRegistrationMain.validEmail();
		UserRegistrationMain.validMobileName();
		UserRegistrationMain.validPassword();	
	}
	
	public static void validFirstName() throws FirstNameException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name : ");
		String firstName = scanner.nextLine();
		FirstName.validFirstName(firstName);
	}
	
	public static void validLastName() throws LastNameException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your last name : ");
		String lastName = scanner.nextLine();
		LastName.validLastName(lastName);
	}
	public static void validEmail() throws EmailException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Email ID : ");
		String email = scanner.nextLine();
		Email.validEmail(email);
	}
	public static void validMobileName() throws MobileNumberException  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Mobile Number : ");
		String mobileNumber = scanner.nextLine();
		MobileNumber.validMobileNumber(mobileNumber);
	}
	
	public static void validPassword() throws PasswordException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Password : ");
		String password = scanner.nextLine();
		Password.validPassword(password);
	}
}
	


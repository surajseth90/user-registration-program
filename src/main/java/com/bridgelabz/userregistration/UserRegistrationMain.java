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
		IUserRegistration validFirstName = ()->{
			System.out.println("Enter your first name : ");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.nextLine();
			try {
				FirstName.validFirstName(name);
			} catch (FirstNameException e) {
				e.printStackTrace();
			}
		};
		validFirstName.userInput();	
	}
	
	public static void validLastName() throws LastNameException {
		IUserRegistration validLastName =()->{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your last name : ");
			String lastName = scanner.nextLine();
			try {
				LastName.validLastName(lastName);
			} catch (LastNameException e) {
				e.printStackTrace();
			}
		};
		validLastName.userInput();
		
	}
	
	public static void validEmail() throws EmailException {
		IUserRegistration validEmail =()->{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your Email ID : ");
			String email = scanner.nextLine();
			try {
				Email.validEmail(email);
			} catch (EmailException e) {
				e.printStackTrace();
			}
		};
		validEmail.userInput();
	}
	
	public static void validMobileName() throws MobileNumberException  {
		IUserRegistration validMobileNumber =()->{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your Mobile Number : ");
			String mobileNumber = scanner.nextLine();
			try {
				MobileNumber.validMobileNumber(mobileNumber);
			} catch (MobileNumberException e) {
				e.printStackTrace();
			}
		};
		validMobileNumber.userInput();
	}
	
	public static void validPassword() throws PasswordException {
		IUserRegistration validPassword = ()->{
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your Password : ");
			String password = scanner.nextLine();
			try {
				Password.validPassword(password);
			} catch (PasswordException e) {
				e.printStackTrace();
			}
		};
		validPassword.userInput();
	}
}
	


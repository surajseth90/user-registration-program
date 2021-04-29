package com.bridgelabz.userregistrationtest;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import com.bridgelabz.userregistration.MobileNumber;

public class MobileNumberTest {

	@Test
	public static void givenMobileNumber_whenValid_shouldReturnTrue() {
		boolean validMobileNumberSample =MobileNumber.validMobileNumber("10 1234567895");
		Assert.assertEquals(true ,validMobileNumberSample);
	}
	
	public static void givenLastName_WhenInvalid_ShouldReturnFalse() {
        boolean invalidMobileNumberSample = MobileNumber.validMobileNumber("1012345678");
        Assert.assertEquals(false, invalidMobileNumberSample);
    }
}
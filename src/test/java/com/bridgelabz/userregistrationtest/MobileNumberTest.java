package com.bridgelabz.userregistrationtest;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import com.bridgelabz.userregistration.MobileNumber;
import com.bridgelabz.userregistration.exception.MobileNumberException;

public class MobileNumberTest {

	@Test
	public void givenMobileNumber_whenValid_shouldReturnTrue() throws MobileNumberException {
		boolean validMobileNumberSample =MobileNumber.validMobileNumber("10 1234567895");
		Assert.assertEquals(true ,validMobileNumberSample);
	}
	@Test
	public void givenLastName_WhenInvalid_ShouldReturnFalse() throws MobileNumberException {
        boolean invalidMobileNumberSample = MobileNumber.validMobileNumber("1012345678");
        Assert.assertEquals(false, invalidMobileNumberSample);
    }
}
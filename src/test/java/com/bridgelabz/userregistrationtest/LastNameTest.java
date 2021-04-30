package com.bridgelabz.userregistrationtest;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import com.bridgelabz.userregistration.LastName;
import com.bridgelabz.userregistration.exception.LastNameException;

public class LastNameTest {

	@Test
	public static void givenLastName_whenValid_shouldReturnTrue() throws LastNameException {
		boolean validLastNameSample =LastName.validLastName("Gupta");
		Assert.assertEquals(true ,validLastNameSample);
	}
	
	public static void givenLastName_WhenInvalid_ShouldReturnFalse() throws LastNameException {
        boolean invalidLastNameSample = LastName.validLastName("gupta");
        Assert.assertEquals(false, invalidLastNameSample);
    }
}
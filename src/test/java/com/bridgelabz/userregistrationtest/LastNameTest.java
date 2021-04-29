package com.bridgelabz.userregistrationtest;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import com.bridgelabz.userregistration.LastName;

public class LastNameTest {

	@Test
	public static void givenLastName_whenValid_shouldReturnTrue() {
		boolean validLastNameSample =LastName.validLastName("Gupta");
		Assert.assertEquals(true ,validLastNameSample);
	}
	
	public static void givenLastName_WhenInvalid_ShouldReturnFalse() {
        boolean invalidLastNameSample = LastName.validLastName("gupta");
        Assert.assertEquals(false, invalidLastNameSample);
    }
}
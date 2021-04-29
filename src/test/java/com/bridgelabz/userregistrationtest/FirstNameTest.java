package com.bridgelabz.userregistrationtest;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

import com.bridgelabz.userregistration.FirstName;

public class FirstNameTest {

	@Test
	public static void givenFirstName_whenValid_shouldReturnTrue() {
		boolean validFirstNameSample =FirstName.validFirstName("Suraj");
		Assert.assertEquals(true ,validFirstNameSample);
	}
	
	public static void givenFirstName_WhenInvalid_ShouldReturnFalse() {
        boolean invalidFirstNameSample = FirstName.validFirstName("suraj");
        Assert.assertEquals(false, invalidFirstNameSample);
    }
}
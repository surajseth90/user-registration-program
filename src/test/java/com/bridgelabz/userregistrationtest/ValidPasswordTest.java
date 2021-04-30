package com.bridgelabz.userregistrationtest;
import org.junit.Test;
import com.bridgelabz.userregistration.Password;
import com.bridgelabz.userregistration.exception.PasswordException;

import static org.junit.Assert.*;
import org.junit.Assert;

public class ValidPasswordTest {
    @Test 
    	public void givenPassword_WhenProper_ShouldReturnTrue() throws PasswordException {
        boolean result = Password.validPassword("Abcdefgcds9067@");
        Assert.assertEquals(true, result);
    }
    
    @Test
    	public void givenPassword_WhenNotProper_ShouldReturnFalse() throws PasswordException {
        boolean result = Password.validPassword("abc687");
        Assert.assertEquals(false, result);
    }
}
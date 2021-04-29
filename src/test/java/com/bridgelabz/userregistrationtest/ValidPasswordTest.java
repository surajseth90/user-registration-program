package com.bridgelabz.userregistrationtest;
import org.junit.Test;
import com.bridgelabz.userregistration.Password;
import static org.junit.Assert.*;
import org.junit.Assert;

public class ValidPasswordTest {
    @Test 
    	public static void givenPassword_WhenProper_ShouldReturnTrue() {
        boolean result = Password.validPassword("Abcdefgcds9067@");
        Assert.assertEquals(true, result);
    }
    
    	public static void givenPassword_WhenNotProper_ShouldReturnFalse() {
        boolean result = Password.validPassword("abc687");
        Assert.assertEquals(false, result);
    }
}
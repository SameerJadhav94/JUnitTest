package org.bridgelabz.assignmenttwenty;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;


public class UserValidatorTest
{

    @Test
    public void givenFirstNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Sameer");
        Assert.assertEquals(true, result);
//        Assert.assertTrue(result); // can also be performed with assertTrue.
    }
    @Test
    public void givenLastNameWhenProperShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Jadhav");
//        Assert.assertEquals(true, result); // can also be performed with assertTrue.
        Assert.assertTrue(result);
    }
    @Test
    public void givenEmailIDeWhenValidShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmailAddress("abc+100@yahoo.com");
//        Assert.assertEquals(true, result); // can also be performed with assertTrue.
        Assert.assertTrue(result);
    }
    @Test
    public void givenMobileNumberWhenValidFormatShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("0 7568438745");
//        Assert.assertEquals(true, result); // can also be performed with assertTrue.
        Assert.assertTrue(result);
    }
}

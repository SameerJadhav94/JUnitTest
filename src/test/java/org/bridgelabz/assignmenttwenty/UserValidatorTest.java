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
}

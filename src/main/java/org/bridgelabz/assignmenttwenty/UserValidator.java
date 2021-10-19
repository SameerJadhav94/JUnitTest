package org.bridgelabz.assignmenttwenty;

import java.util.regex.Pattern;

public class UserValidator {
    private static final String firstNamePattern = "^[A-Z]{1}[a-z]{2,}$"; //regex
    private static final String lastNamePattern = "^[A-Z]{1}[a-z]{2,}$"; //regex
    private static final String emailIDPattern = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$"; //regex
    private static final String mobileNumberPattern = "(0|91)*[ ][7-9][0-9]{9}"; //regex
    private static final String passwordPattern1 = "^[a-zA-Z]{8,}$"; //regex
    private static final String passwordPattern2 = "^(?=.*[A-Z])[A-Za-z]{8,}$"; //regex
    private static final String passwordPattern3 = "^(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]{8,}$"; //regex
    private static final String passwordPattern4 = "^(?=.*[0-9])(?=.*[A-Z])(?=.*([$&+,:;=?@#|/'<>.^*()%!-]))(?=.{8,}$).*$"; //regex


    public boolean validateFirstName(String fName) {
        Pattern pattern = Pattern.compile(firstNamePattern);
        return pattern.matcher(fName).matches();
    }

    public boolean validateLastName(String lName) {
        Pattern pattern2 = Pattern.compile(lastNamePattern);
        return pattern2.matcher(lName).matches();
    }

    public boolean validateEmailAddress(String email) {
        Pattern pattern3 = Pattern.compile(emailIDPattern);
        return pattern3.matcher(email).matches();
    }

    public boolean validateMobileNumber(String mobileNumber) {
        Pattern pattern3 = Pattern.compile(mobileNumberPattern);
        return pattern3.matcher(mobileNumber).matches();
    }

    public boolean validatePasswordPattern1(String passwordPattern) {
        Pattern pattern4 = Pattern.compile(passwordPattern1);
        return pattern4.matcher(passwordPattern).matches();
    }

    public boolean validatePasswordPattern2(String passwordPattern) {
        Pattern pattern5 = Pattern.compile(passwordPattern2);
        return pattern5.matcher(passwordPattern).matches();
    }

    public boolean validatePasswordPattern3(String passwordPattern) {
        Pattern pattern6 = Pattern.compile(passwordPattern3);
        return pattern6.matcher(passwordPattern).matches();
    }

    public boolean validatePasswordPattern4(String passwordPattern) {
        Pattern pattern7 = Pattern.compile(passwordPattern4);
        return pattern7.matcher(passwordPattern).matches();
    }



}

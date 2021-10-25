package com.bridgelabz.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckingPattern {


    public static void firstname(String First) {
        //checking the pattern for first name
        System.out.println("Printing the First Namae");
        Pattern pattern = Pattern.compile("^[A-Za-z]{3,6}$");
        Matcher matcher = pattern.matcher(First);
        if (matcher.find()) {
            System.out.println("Pattern matched");
        } else {
            System.out.println("Pattern not matched");
        }
    }

    public static void lastname(String Lastname) {
        //checking the pattern for lasst name
        System.out.println("Printing the last name");
        Pattern pattern = Pattern.compile("^[A-Za-z]{3,6}$");
        Matcher matcher = pattern.matcher(Lastname);
        if (matcher.find()) {
            System.out.println("Pattern matched");
        } else {
            System.out.println("Pattern not matched");
        }
    }

    public static void emailid(String emailId) {
        //email pattern checking
        String email = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
        Pattern pattern = Pattern.compile(email);
        Matcher matcher = pattern.matcher(emailId);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    public static void mobilenum(String mobileNum) {
        //checking mobile number pattern
        String mobile = "^[0-9]{2}\\s{1}[0-9]{10}$";
        Pattern pattern = Pattern.compile(mobile);
        Matcher matcher = pattern.matcher(mobileNum);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }


}

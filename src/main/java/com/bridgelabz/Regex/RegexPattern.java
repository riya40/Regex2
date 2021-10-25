package com.bridgelabz.Regex;
import java.util.*;
/**
 * Printing the userDetails
 * Checking the pattern for user details
 *
 */
public class RegexPattern extends CheckingPattern
{
        static Scanner scanner = new Scanner(System.in);
        static String firstName,lastName,emailId,mobileNum,password;

        public static void main(String[] args) {
             FirstName();
             LastName();
             EmailId();
             MobileNum();
             Password();

    }
        //Added first ame validation
        public static String FirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.next();
        CheckingPattern.firstname(firstName);
            return firstName;
        }

        //Added last name validation
    public static String LastName(){
        System.out.println("Enter your last Name");
        lastName = scanner.next();
        CheckingPattern.lastname(lastName);
        return lastName;
    }
    public static String EmailId() {
        System.out.println("Enter your EmailId");
        emailId = scanner.next();
        CheckingPattern.emailid(emailId);
        return emailId;
    }
    public static String MobileNum() {
        System.out.println("Enter your MobileNumber");
        mobileNum = scanner.next();
        CheckingPattern.mobilenum(mobileNum);
        return mobileNum;
    }
    public static String Password() {
        System.out.println("Enter your Password");
        password = scanner.next();
        CheckingPattern.password(password);
        return password;

    }
    

}


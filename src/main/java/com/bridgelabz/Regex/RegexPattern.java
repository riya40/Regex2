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
        public static String FirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.next();
        CheckingPattern.firstname(firstName);
            return firstName;
        }

    }


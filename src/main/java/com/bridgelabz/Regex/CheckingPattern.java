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


}

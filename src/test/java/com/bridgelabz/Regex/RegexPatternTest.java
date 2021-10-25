package com.bridgelabz.Regex;

import static com.bridgelabz.Regex.RegexPattern.firstName;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.Assert.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Unit test cases for simple RegexPattern.
 */
public class RegexPatternTest
{
    CheckingPattern checkingPattern= new CheckingPattern();
    RegexPattern regexPattern=new RegexPattern();
    @Test
    public void Firstnamechceking(){
        String first=regexPattern.userFirstName();
        //Pattern firstname= Pattern.compile("^[A-Za-z]{3,6}$");
        Assertions.assertEquals("p",first);
   }
}

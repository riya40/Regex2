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
    RegexPattern regexPattern=new RegexPattern();
    @Test
    public void Firstnamechceking(){
        String first=regexPattern.FirstName();
        Assertions.assertEquals("p",first);
   }
    @Test
    public void Lastnamechceking(){
        String last=regexPattern.LastName();
        Assertions.assertEquals("p",last);
    }
    @Test
    public void emailchceking(){
        String mail=regexPattern.EmailId();
        Assertions.assertEquals("dfsdv22@mail.com",mail);
    }
    @Test
    public void mobilenumchceking(){
        String num=regexPattern.EmailId();
        Assertions.assertEquals("9191239743",num);
    }
    @Test
    public void passwordchceking(){
        String pwd=regexPattern.EmailId();
        Assertions.assertEquals("dfsdv22@mail.com",pwd);
    }
}

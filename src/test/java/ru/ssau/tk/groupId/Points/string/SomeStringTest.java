package ru.ssau.tk.groupId.Points.string;

import org.testng.annotations.Test;
import ru.ssau.tk.groupId.Points.task.SomeString;

import static org.testng.Assert.*;

public class SomeStringTest {

    @Test
    public void testPalindromeCheck() {
        SomeString myString = new SomeString();
        assertEquals(myString.palindromeCheck("123"),false);
        assertEquals(myString.palindromeCheck("12321"),true);
        assertEquals(myString.palindromeCheck("hello olleh"),true);
        assertEquals(myString.palindromeCheck("34567"),false);
        assertEquals(myString.palindromeCheck("7777777"),true);
    }
    @Test
    public void testFirstOccurrence() {
        SomeString myString = new SomeString();
        assertEquals(myString.firstOccurrence("hello","el"),1);
        assertEquals(myString.firstOccurrence("aaaaaaaaadda","ad"),8);
        assertEquals(myString.firstOccurrence("9991","200"),-1);
    }
}
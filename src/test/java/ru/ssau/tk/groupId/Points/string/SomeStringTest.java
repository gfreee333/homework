package ru.ssau.tk.groupId.Points.string;

import org.testng.annotations.Test;
import ru.ssau.tk.groupId.Points.task.SomeString;

import static org.testng.Assert.*;

public class SomeStringTest {

    @Test
    public void testPalindromeCheck() {
        SomeString myString = new SomeString();
        assertEquals(myString.palindromeCheck("123"), false);
        assertEquals(myString.palindromeCheck("12321"), true);
        assertEquals(myString.palindromeCheck("hello olleh"), true);
        assertEquals(myString.palindromeCheck("34567"), false);
        assertEquals(myString.palindromeCheck("7777777"), true);
    }

    @Test
    public void testFirstOccurrence() {
        SomeString myString = new SomeString();
        assertEquals(myString.firstOccurrence("hello", "el"), 1);
        assertEquals(myString.firstOccurrence("aaaaaaaaadda", "ad"), 8);
        assertEquals(myString.firstOccurrence("9991", "200"), -1);
    }

    @Test
    public void testLineOccurrence() {
        SomeString someString = new SomeString();
        assertEquals(someString.lineOccurrence("11ll11ll", "11"), 4);
        assertEquals(someString.lineOccurrence("1111111", "22"), -1);
        assertEquals(someString.lineOccurrence("hellohello", "he"), 5);
        assertEquals(someString.lineOccurrence("privettprivett", "tt"), 12);
        assertEquals(someString.lineOccurrence("lllllalllllla", "la"), 11);

    }
    @Test
    public void testLastOccurrenceFirstHalf() {
        SomeString str = new SomeString();
        assertEquals(str.lastOccurrenceFirstHalf("ababaabaaaaadaaa","ab"),5);
        assertEquals(str.lastOccurrenceFirstHalf("bbbbbabbbbbbabbbbbbbbbbabbbab","ab"),12);
        assertEquals(str.lastOccurrenceFirstHalf("aaaaaaaaab","ab"),-1);
    }
    @Test
    public void testTheNumberOfLinesInTheArray() {
        String[] strings = {"14414", "p2014p", "142014", "30000","44444","papapap","222","p"};
        assertEquals(SomeString.theNumberOfLinesInTheArray(strings,"14","14"),2);
        assertEquals(SomeString.theNumberOfLinesInTheArray(strings,"p","p"),3);
    }
    @Test
    public void testTheNumberOfInTheArrayAndIgnoreSymbol() {
        String[] strings = {"        11000011     ", "         22000041 ", " 2200021 ", " 2200021 "};
        assertEquals(SomeString.theNumberOfInTheArrayAndIgnoreSymbolSpace(strings, "11", "11"), 1);
        assertEquals(SomeString.theNumberOfInTheArrayAndIgnoreSymbolSpace(strings, "22", "21"), 2);
    }
    @Test
    public void testReplacingString() {
        String str1 = "popoopoopopo";
        String str2 = "oo";
        String str3 = "00";
        String strTest = "hellp ";
        assertEquals(SomeString.replacingString(str1,str2,str3),"pop00p00popo");
        assertEquals(SomeString.replacingString(str1,str2,strTest),"pophellp phellp popo");
    }
    @Test
    public void testSomeStringToOreFrom() {
        String str = "hello,world";
        assertEquals(SomeString.someStringToOreFrom(str,0,4),"hell");
        assertEquals(SomeString.someStringToOreFrom(str,0,0),null);
        assertEquals(SomeString.someStringToOreFrom(str,-1,3),"hel");
    }
    @Test
    public void testSplittingSubstringString() {
        assertEquals(SomeString.splittingSubstringString("hello i am 5 year")[0],"Hello");
        assertEquals(SomeString.splittingSubstringString("hello im dead")[2],"Dead");
    }
}
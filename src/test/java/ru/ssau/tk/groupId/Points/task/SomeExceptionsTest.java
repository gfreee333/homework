package ru.ssau.tk.groupId.Points.task;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SomeExceptionsTest {
    SomeExceptions exceptions = new SomeExceptions();

    @Test
    public void testStringArray() {

        assertEquals(exceptions.StringArray(new String[]{"арбуз", "герой", "ураины"}, 1), new char[]{'р', 'е', 'р'});
        assertThrows(NullPointerException.class, () -> {
            exceptions.StringArray(new String[3], 1);
        });
    }

    @Test
    public void testCharReturn() {

        String[] str = {"hello", "world"};
        assertEquals(exceptions.charReturn(str, 0, 2), 'l');
        assertEquals(exceptions.charReturn(str, 1, 2), 'r');
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            exceptions.charReturn(str,2,3);
        });
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            exceptions.charReturn(new String[]{"hello", "hello"}, 2, 1);
        });
    }

    @Test
    public void testDivisionString() {
        String str1 = "2";
        String str2 = "2";
        assertEquals(exceptions.divisionString(str1,str2),1);
        assertThrows(NumberFormatException.class,()->{
            exceptions.divisionString("5","");
        });
        assertThrows(NumberFormatException.class,()->{
            exceptions.divisionString("gegeg","3");
        });
    }
}
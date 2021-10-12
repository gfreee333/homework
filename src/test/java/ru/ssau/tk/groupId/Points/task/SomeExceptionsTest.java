package ru.ssau.tk.groupId.Points.task;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SomeExceptionsTest {
    SomeExceptions exceptions = new SomeExceptions();
    @Test
    public void testStringArray() {

        assertEquals(exceptions.StringArray(new String[]{"арбуз","герой","ураины"},1),new char[]{'р','е','р'});
        assertThrows(NullPointerException.class,()->{
        exceptions.StringArray(new String[3],1);
        });
    }
}
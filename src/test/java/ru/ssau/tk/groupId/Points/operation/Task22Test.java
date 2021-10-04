package ru.ssau.tk.groupId.Points.operation;

import org.testng.annotations.Test;
import ru.ssau.tk.groupId.Points.Task22;

import static org.testng.Assert.*;

public class Task22Test {

    @Test
    public void testSetNumber() {
        Task22 array = new Task22();
        assertEquals(array.SetNumber(20),20);
    }
}
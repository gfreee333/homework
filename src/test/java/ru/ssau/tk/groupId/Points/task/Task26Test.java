package ru.ssau.tk.groupId.Points.task;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task26Test {
    private int lengthTest = 10;

    @Test
    public void testArray() {
        int[] array = Task26.createSomeArraySquareIndex(lengthTest);
        assertEquals(array[lengthTest - 1], 81, 0.001);
    }
}
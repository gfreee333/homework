package ru.ssau.tk.groupId.Points.Task;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SomeArrayTest {
    private int lengthArrayTest = 10;
    @Test
    public void testCreateSomeArrayDownEven() {
        int[] array = SomeArray.createSomeArrayDownEven(lengthArrayTest);
        for (int i = lengthArrayTest - 1; i >= 0; i--) {
            assertEquals(array[i], 2 * (lengthArrayTest - i), 0.001);
        }
    }
}
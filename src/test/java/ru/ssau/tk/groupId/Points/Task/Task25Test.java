package ru.ssau.tk.groupId.Points.Task;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task25Test {
    public int size;

    @Test
    public void testCreateSomeArrayFib() {
        int[] array = Task25.createSomeArrayFib(5);
        for (int i = 0; i < array.length - 1; i++) {
            if (array.length <= 2) {
                assertEquals(array[i], 1, 0.001);
            } else {
                for (int j = 2; j < array.length - 3; j++) {
                    assertEquals(array[j], i - (j + 1), 0.0001);
                }
            }
        }
    }
}
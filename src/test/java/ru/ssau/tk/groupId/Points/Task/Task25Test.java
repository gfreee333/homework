package ru.ssau.tk.groupId.Points.Task;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task25Test {
public int lengthArrayTest = 10;
    @Test
        public void testCreateSomeArrayFibonacci() {
            int[] array = Task25.createSomeArrayFibonacci(lengthArrayTest);
            assertEquals(array[lengthArrayTest - 1], 89, 0.001);
        }
    }

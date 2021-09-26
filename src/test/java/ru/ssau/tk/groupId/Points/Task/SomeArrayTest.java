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

    @Test
    public void testCreateSomeArrayNaturalNumber() {
        int[] array = SomeArray.createSomeArrayMultiplesOfThree(lengthArrayTest);
        for (int i = 0; i < lengthArrayTest; i++) {
            assertTrue(array[i] % 3 != 0);
        }
    }

    @Test
    public void testCreateSomeArrayArithmeticProgression() {
        double[] array = SomeArray.createSomeArrayArithmeticProgression(lengthArrayTest,10,13);
        for (int i = lengthArrayTest; i > lengthArrayTest ; i--) {
            assertEquals(array[i-1]-array[i],13,0.01);
        }
    }

    @Test
    public void testCreateSomeArrayGeometryProgression() {
        double[] array = SomeArray.createSomeArrayGeometryProgression(lengthArrayTest,1,5);
            for (int i = 1; i < lengthArrayTest; i++) {
                assertEquals(array[i] / array[i - 1], 5, 0.001);
            }
        }
}
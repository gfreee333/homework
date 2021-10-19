package ru.ssau.tk.groupId.Points.task;

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
        double[] array = SomeArray.createSomeArrayArithmeticProgression(lengthArrayTest, 10, 13);
        for (int i = lengthArrayTest; i > lengthArrayTest; i--) {
            assertEquals(array[i - 1] - array[i], 13, 0.01);
        }
    }

    @Test
    public void testCreateSomeArrayGeometryProgression() {
        double[] array = SomeArray.createSomeArrayGeometryProgression(lengthArrayTest, 1, 5);
        for (int i = 1; i < lengthArrayTest; i++) {
            assertEquals(array[i] / array[i - 1], 5, 0.001);
        }
    }

    @Test
    public void testCreateSomeArrayIntDivisorsValue() {
        int number = 10;
        double[] array = SomeArray.createSomeArrayIntDivisorsValue(10);
        for (double v : array) {
            assertEquals(number % v, 0, 0.001);
        }
    }

    @Test
    public void testCreateSomeArraySymmetric() {
        int[] array = SomeArray.createSomeArraySymmetric(7);

        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], array[7 - i - 1], 0.001);
        }
    }

    @Test
    public void testCreateSomeArrayAlternating() {
        double[] value = {1.0, 2.0, 3.0, 4.0};
        double[] array = SomeArray.createSomeArrayAlternating(value);
        for (double v : array) {
            assertEquals(-v, -v, 0.001);
        }
    }

    @Test
    public void testCreateSomeArraySearch() {
        double[] array = new double[]{1., 3., 4., 5};
        assertFalse(SomeArray.createSomeArraySearch(array, 200));
        assertTrue(SomeArray.createSomeArraySearch(array, 3));
    }

    @Test
    public void testCheckSomeArrayNull() {
        assertTrue(SomeArray.checkSomeArrayNull(new Integer[]{1, 2, 3, 4, 5, null}));
        assertFalse(SomeArray.checkSomeArrayNull(new Integer[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void testCheckSomeArrayEvenNumbers() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8};
        assertEquals(SomeArray.checkSomeArrayEvenNumbers(array), 5);
        int[] array2 = new int[]{1, 1, 1, 1, 1, 1};
        assertEquals(SomeArray.checkSomeArrayEvenNumbers(array2), 0);
    }

    @Test
    public void testFindMaxNumberInSomeArray() {
        Integer[] array = new Integer[]{1,2,3,4,5,6};
        assertEquals(SomeArray.findMaxNumberInSomeArray(array),6,0.001);
        Integer[] array2 = new Integer[]{};
        assertEquals(SomeArray.findMaxNumberInSomeArray(array2),null);
    }

    @Test
    public void testSumEvenElementNumber() {
        assertEquals(SomeArray.sumEvenElementNumber(new Integer[]{1,2,3,4,5,6}),12,0.001);
        assertEquals(SomeArray.sumEvenElementNumber(new Integer[]{1,25,3,25,5,50}),100,0.001);
        }

    @Test
    public void testCheckNumInSomeArray() {
        int[] array = new int[]{1,2,3,4,5,6,7,8};
        int[] array2 = new int[]{4,4,4,4,4,4,4,4};
                assertTrue(SomeArray.checkNumInSomeArray(array));
                assertFalse(SomeArray.checkNumInSomeArray(array2));
    }
}
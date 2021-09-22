import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task23Test {

    @Test
    public void testCreateArray() {
        int[] array = Task23.createArray(10);
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], i * 2 - 1, 0.001);
        }
        }
    }
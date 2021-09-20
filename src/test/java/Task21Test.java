import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Task21Test {
    int[] array= new Task21().setNumber(5);
    @Test
    public void testCreateArray() {
        assertEquals(array.length,5);
        assertEquals(array[0],0);
        assertEquals(array[4],4);
    }
}
package ru.ssau.tk.groupId.Points.operation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {
    TangentOperation tanOperation = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tanOperation.apply(20.0), 2.2371, 0.0001);
        assertEquals(tanOperation.apply(1.0), 1.5574, 0.0001);
        assertEquals(tanOperation.apply(-20.0), -2.2371, 0.0001);
        assertEquals(tanOperation.apply(-1.0 / 0.0), 0.0 / 0.0, 0.00001);
        assertEquals(tanOperation.apply(0.0 / 0.0), 0.0 / 0.0, 0.0001);
    }
}
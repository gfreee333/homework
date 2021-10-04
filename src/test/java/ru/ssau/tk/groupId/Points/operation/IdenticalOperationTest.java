package ru.ssau.tk.groupId.Points.operation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {
    IdenticalOperation identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(16.0), 16.0, 0.001);
        assertEquals(identical.apply(-16.0), -16.0, 0.0001);
        assertEquals(identical.apply(24.0), 24.0, 0.0001);
        assertEquals(identical.apply(-1.0 / 0.0), -1.0 / 0.0, 0.000001);
        assertEquals(identical.apply(0.0 / 0.0), 0.0 / 0.0, 0.00001);
    }
}
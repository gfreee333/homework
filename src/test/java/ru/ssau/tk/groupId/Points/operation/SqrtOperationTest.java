package ru.ssau.tk.groupId.Points.operation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {
    SqrtOperation sqrtOperation = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrtOperation.apply(25.0), 5.0, 0.0001);
        assertEquals(sqrtOperation.apply(81.0), 9.0, 0.0001);
        assertEquals(sqrtOperation.apply(100.0), 10.0, 0.0001);
        assertEquals(sqrtOperation.apply(-1.0 / 0.0), 0.0 / 0.0, 0.000001);
        assertEquals(sqrtOperation.apply(0.0 / 0.0), 0.0 / 0.0, 0.0001);
    }
}
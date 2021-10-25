package ru.ssau.tk.groupId.Points.task;

import java.sql.Array;

public class Task23 {
    public static int[] createArray(int length) {
        int[] someArray = new int[length];
        for (int i = 0; i < length; i++) {
            someArray[i] = 2 * i - 1;
        }
        return someArray;
    }
}


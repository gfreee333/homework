package ru.ssau.tk.groupId.Points.task;

public class Task26 {
    public static int[] createSomeArraySquareIndex(int length) {
        int[] someArray = new int[length];
        for (int i = 0; i < length; i++) {
            someArray[i] = i * i;
        }
        return someArray;
    }
}

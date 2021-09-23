package ru.ssau.tk.groupId.Points.Task;

public class SomeArray {
        public static int[] createSomeArrayDownEven(int length) {
            int[] someArray = new int[length];
            for (int i = length - 1; i >= 0; i--) {
                someArray[i] = 2 * (length - i);
            }
            return someArray;
        }
}

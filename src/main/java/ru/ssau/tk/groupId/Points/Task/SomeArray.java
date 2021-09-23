package ru.ssau.tk.groupId.Points.Task;

public class SomeArray {
        public static int[] createSomeArrayDownEven(int length) {
            int[] someArray = new int[length];
            for (int i = length - 1; i >= 0; i--) {
                someArray[i] = 2 * (length - i);
            }
            return someArray;
        }
        public static int[] createSomeArrayMultiplesOfThree(int length)
        {
            int[] someArray = new int[length];
            int num = 1;
            for (int i = 0; i < length; i++) {
                if (num % 3 == 0) {
                    num++;
                }
                someArray[i] = num;
                num++;
            }
            return someArray;
        }
}



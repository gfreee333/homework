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
        public static double[] createSomeArrayArithmeticProgression( int length, int firstElement, int difference)
        {
                double[] someArray = new double[length];
                someArray[0] = firstElement;
            for (int i = 1; i <length ; i++) {
                someArray[i] = someArray[i] + difference;
            }
            return someArray;
        }
}



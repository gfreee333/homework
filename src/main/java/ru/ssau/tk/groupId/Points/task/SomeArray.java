package ru.ssau.tk.groupId.Points.task;

import java.util.Arrays;

public class SomeArray {
    public static int[] createSomeArrayDownEven(int length) {
        int[] someArray = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            someArray[i] = 2 * (length - i);
        }
        return someArray;
    }

    public static int[] createSomeArrayMultiplesOfThree(int length) {
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

    public static double[] createSomeArrayArithmeticProgression(int length, int firstElement, int difference) {
        double[] someArray = new double[length];
        someArray[0] = firstElement;
        for (int i = 1; i < length; i++) {
            someArray[i] = someArray[i] + difference;
        }
        return someArray;
    }

    public static double[] createSomeArrayGeometryProgression(int length, int firstElement, int factor) {
        double[] someArray = new double[length];
        someArray[0] = firstElement;
        for (int i = 1; i < length; i++) {
            someArray[i] = someArray[i - 1] * factor;
        }
        return someArray;
    }

    public static double[] createSomeArrayIntDivisorsValue(int number) {

        int length = 1;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                length++;
            }
        }
        double[] someArray = new double[length];
        int k = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                someArray[k] = i;
                k++;
            }
        }
        someArray[length - 1] = number;
        return someArray;
    }

    public static int[] createSomeArraySymmetric(int length) {
        int[] someArray = new int[length];
        for (int i = 1; i < length / 2 + 1; i++) {
            someArray[i - 1] = i;
            someArray[length - i] = i;
        }
        if (length % 2 == 1) {
            someArray[length / 2] = someArray[length / 2 - 1] + 1;
        }
        return someArray;
    }

    public static double[] createSomeArrayAlternating(double[] someArray) {
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = -someArray[i];
        }
        return someArray;
    }

    public static boolean createSomeArraySearch(double[] someArray, double number) {
        for (double value : someArray)
            if (value == number) {
                return true;
            }
        return false;
    }

    public static boolean checkSomeArrayNull(Integer[] someArray) {
        for (Integer integer : someArray)
            if (integer == null) {
                return true;
            }
        return false;
    }

    public static int checkSomeArrayEvenNumbers(int[] someArray) {
        int counterEvenNumber = 0;
        for (int value : someArray) {
            if (value % 2 == 0) {
                counterEvenNumber++;
            }
        }
        return counterEvenNumber;
    }

    public static Integer findMaxNumberInSomeArray(Integer[] someArray) {
        if (someArray.length == 0)
            return null;
        Integer max = someArray[0];
        for (int i = 1; i < someArray.length; i++) {
            if (someArray[i] > max) {
                max = someArray[i];
            }
        }
        return max;
    }

    public static Integer sumEvenElementNumber(Integer[] someArray) {
        int sum = 0;
        for (int i = 0; i < someArray.length; i++) {
            if (i % 2 != 0) {
                sum += someArray[i];
            }
        }
        return sum;
    }

    public static boolean checkNumInSomeArray(int[] someArray) {
        int first = 0;
        int last = 0;
        for (int i = 0; i < someArray.length; i += 2) {
            if (someArray[i] % someArray[0] == 0) {
                first++;
            }
            if (someArray[i] % someArray[someArray.length - 1] == 0) {
                last++;
            }

        }
        return first > last;
    }

    public static int findMostPopularNumInSomeArray(int[] someArray) {
        int count = 0, maxCount = 0, currentNum, maxNum = 0;
        for (int value : someArray) {
            currentNum = value;
            for (int item : someArray) {
                if (currentNum == item)
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxNum = currentNum;
            }
            count = 0;
        }
        return maxNum;
    }

    static int equalsElementIndexInSomeArray(Number[] array, Number found) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(found)) {
                return i;
            }
        }
        return -1;
    }

    public static void swapFirstMaxAndMinNumInSomeArray(int[] someArray) {
        int maxNumber = someArray[0], minNumber = someArray[0], maxIndex = 0, minIndex = 0;
        for (int i = 1; i < someArray.length; i++) {
            if (someArray[i] > maxNumber) {
                maxNumber = someArray[i];
                maxIndex = i;
            }
            if (someArray[i] < minNumber) {
                minNumber = someArray[i];
                minIndex = i;
            }
        }
        someArray[maxIndex] = minNumber;
        someArray[minIndex] = maxNumber;
    }

    public static void bitNoArrayOperation(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = ~array[i];
        }
    }

    public static int[] createArrayBitNoArrayOperation(int[] array) {
        int[] arrayNOT = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayNOT[i] = ~array[i];
        }
        return arrayNOT;
    }

    public static int[] pairSumInSomeArray(int[] someArray) {
        int[] array = new int[someArray.length / 2 + (someArray.length % 2 == 0 ? 0 : 1)];
        for (int i = 0; i < array.length; i++) {
            array[i] = someArray[2 * i] + (2 * i + 1 < someArray.length ? someArray[2 * i + 1] : 0);
        }
        return array;
    }

    static double multiInSomeArray(double[] someArray) {
        double value = 1;
        for (double v : someArray) {
            if (!(Double.isNaN(v) || v == Double.NEGATIVE_INFINITY || v == Double.POSITIVE_INFINITY || v == 0)) {
                value *= v;
            }
        }
        return value;
    }

    static boolean[] findEvenNumbers(int[] array) {
        boolean[] bool = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                bool[i] = true;
            } else {
                bool[i] = false;
            }
        }
        return bool;
    }

}



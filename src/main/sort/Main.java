package main.sort;

public class Main {
    public static void main (String[] args)
    {
        int[] array = new int[]{202,55,228,1703,202};
        printArray(array);
        boolean inSorted = false ;
        while (!inSorted)
        {
            inSorted = true;
        for (int i = 1; i <array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                inSorted = false;
            }
        }
            printArray(array);
        }
printArray(array);
    }
    private static void printArray(int[] arr) {
        System.out.print(" | ");
        for (int i = 0; i < arr.length; i++) {
            if(i>0)
            {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
    }

}

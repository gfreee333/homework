package main;

public class Task22 {
    public int[] SetNumber (int size)
    {
        int[] array = new int[size];
        array[0] = 2 ;
        array[size-1]=2;
        for (int i = 1; i < array.length-1 ; i++) {
            array[i]= 1;
        }
        return array;
    }
}

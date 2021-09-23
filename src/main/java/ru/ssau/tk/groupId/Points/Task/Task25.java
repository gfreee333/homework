package ru.ssau.tk.groupId.Points.Task;

public class Task25 {
    public static int[] createSomeArrayFib(int lentgh){
        int[] array = new int[lentgh];
        for (int i = 0; i < lentgh-1 ; i++) {
                if (i <= 2)
                {
                    array[i] = 1;
                }
                else {
                    for (int j = 0; j < (lentgh-3); j++) {
                        array[i] = i - (j+1);
                    }
                }
        }
        return array;
    }
}

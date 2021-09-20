public class Task21 {
        public static int[] setNumber (int value )
        {
            int[] array = new int[value];
            for (int i = 1; i < array.length ; i++) {
                array[i] = i;
            }
            return array;
        }
}

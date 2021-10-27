package ru.ssau.tk.groupId.Points;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestWork {
    public static void main(String[] args) throws FileNotFoundException {
        String text = "Hello, world";
        try {
        PrintStream prStr = new PrintStream("C:\\Users\\Антон\\Desktop\\stream.txt");
        prStr.print(text);
            for (int i = 0; i < 1000; i=i+7) {
                prStr.println(i);
            }
        }
        catch (Exception e){
                System.out.println(e.getMessage());
        }

    }

}

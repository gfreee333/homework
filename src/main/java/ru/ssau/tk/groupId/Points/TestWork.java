package ru.ssau.tk.groupId.Points;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class TestWork {
    public static void main(String[] args) throws FileNotFoundException {
        String text = "Hello, world";
        try {
            PrintStream prStr = new PrintStream("C:\\Users\\Антон\\Desktop\\stream.txt");
            prStr.print(text);
            for (int i = 0; i < 1000; i = i + 7) {
                prStr.println(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
        FileOutputStream out = new FileOutputStream("File.txt");
        byte buffer[] = text.getBytes();
        out.write(buffer);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            FileInputStream in = new FileInputStream("File.txt");
            int i = -1;
            while((i = in.read()) != -1)
            {
                System.out.print((char)i);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

}

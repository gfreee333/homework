package ru.ssau.tk.groupId.Points.string;

import java.nio.charset.StandardCharsets;

public class SomeString {

    public void lineOutput(String string) {
        for (int i = 0; i < string.length(); i++) {

            System.out.println(string.charAt(i));
        }
    }
    public void getStringBytes(String myString)
    {
        byte[] stringBytes = myString.getBytes();
        for (int bytes : stringBytes)
        {
            System.out.println(bytes);
        }
    }


    public static void main(String[] args) {
        System.out.println("task 3.1");
        String s1 = "HELLO WORLD";
        String s2 = "привет мир";
        SomeString String = new SomeString();
        String.lineOutput(s1);
        System.out.println("new task 3.2: ");
        String.getStringBytes(s1);
        String.getStringBytes(s2);
    }

}

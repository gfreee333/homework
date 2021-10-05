package ru.ssau.tk.groupId.Points.string;

public class SomeString {

    public void lineOutput(String string) {
        for (int i = 0; i < string.length(); i++) {

            System.out.println(string.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s1 = "HELLO WORLD";
        SomeString String = new SomeString();
        String.lineOutput(s1);
    }
}

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

    public void studyingCharacterEscaping(){
        int i = 0;
        System.out.println("Символ\t№" + ++i);
        System.out.println("Символ\b№" + ++i);
        System.out.println("Символ\n№" + ++i);
        System.out.println("Символ\r№" + ++i);
        System.out.println("Символ\'№" + ++i);
        System.out.println("Символ\"№" + ++i);
        System.out.println("Символ\\№" + ++i);
    }

    public void comparisonAndConclusion()
    {
        String s1 = "hello" + " world";
        String s2 = new String("hello world");
        System.out.println(s1 == s2);
        System.out.println(s2.equals(s1));
    }
    public boolean palindromeCheck(String myString)
    {
    String palindrome = new StringBuilder(myString).reverse().toString();
        return myString.equals(palindrome);
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
        System.out.println("task 3.3: ");
        String.comparisonAndConclusion();
        System.out.println("Task 3.6: ");
        String.studyingCharacterEscaping();

    }

}

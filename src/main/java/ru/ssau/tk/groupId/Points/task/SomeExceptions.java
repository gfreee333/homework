package ru.ssau.tk.groupId.Points.task;

import org.glassfish.grizzly.utils.ArrayUtils;

public class SomeExceptions {

    public char[] StringArray(String[] string, int n) {
        char[] charA = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            charA[i] = string[i].charAt(n);
        }
        return charA;
    }

    public char charReturn(String[] string, int m, int n) {
        return string[m].charAt(n);
    }

    public int divisionString(String str1, String str2) {
        return Integer.parseInt(str1) / Integer.parseInt(str2);
    }
}

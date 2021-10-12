package ru.ssau.tk.groupId.Points.task;

public  class SomeExceptions {

    public char[] StringArray(String[] string, int n) {
        char[] charA = new char[string.length];
        for (int i = 0; i< string.length; i++) {
        charA[i] = string[i].charAt(n);
        }
        return charA;
    }
}

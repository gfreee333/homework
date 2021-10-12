package ru.ssau.tk.groupId.Points.task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearnException {
    public static void main(String[] args) {
        File file = new File("hello");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File file1 = new File("hello.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File не найден: ");
        }
        try {
            Object obj = null;
            obj.hashCode();
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
    }
}

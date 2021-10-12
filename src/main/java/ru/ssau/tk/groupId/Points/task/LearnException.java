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
    }
}

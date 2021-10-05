package ru.ssau.tk.groupId.Points.pinpong;

import javax.swing.*;
import java.util.jar.JarFile;

public class Main {
    public static void main (String[] args)
    {

        GameLogic game = new GameLogic();
        JFrame window = new JFrame("pong");
        window.setSize(800,500);
        window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocation(200,100);
        window.add(game);

    }
}

package ru.ssau.tk.groupId.Points;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton button;

    public MyFrame() {
        ImageIcon icon = new ImageIcon("![](snake.png)");
        button = new JButton();
        button.addActionListener(e ->{System.out.println("hello");});
        button.setBounds(200, 100, 100, 100);
        button.setFocusable(false);
        button.setBackground(Color.BLACK);
        button.setIcon(icon);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
    }
}
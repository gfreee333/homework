package ru.ssau.tk.groupId.Points;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    int count = 1000;
    public MyFrame() {
        ImageIcon icon = new ImageIcon("(snake.png)");
        button = new JButton();
        button.addActionListener(this);
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
        for (int i = count; i > count-7 ; i--) {
            count = count-7;
                System.out.println(count);
                if(count<0)
                {
                    return;
                }
            }
        }
    }
}